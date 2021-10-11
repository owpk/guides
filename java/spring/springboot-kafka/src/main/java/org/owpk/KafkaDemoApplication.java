package org.owpk;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import static org.owpk.ReflectUtils.getAllPublicMethods;
import static org.owpk.ReflectUtils.getAllValuesFromGetterMethods;

@SpringBootApplication
@RequiredArgsConstructor
public class KafkaDemoApplication implements CommandLineRunner {

    public static final String TOPIC = "quickstart-3";

    private final KafkaProducer<String, String> kafkaProducer;
    private final KafkaConsumer<String, String> kafkaConsumer;

    private final ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(KafkaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Receiving messages from kafka....");
        kafkaConsumer.subscribe(List.of(TOPIC, "quickstart-2"));
        consume(kafkaConsumer);
        produce(kafkaProducer);
//        ((ConfigurableApplicationContext) ctx).close();
    }

    private static void printFutureValues(RecordMetadata future) throws ClassNotFoundException {
        var methods = getAllPublicMethods(future.getClass());
        List<Object> objects;
        objects = getAllValuesFromGetterMethods(methods, future);
        var futureValueMap = Utils.combineTwoLists(
                methods.stream().map(Method::getName).collect(Collectors.toList()),
                objects);
        futureValueMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    private static void produce(KafkaProducer<String, String> producer) throws ExecutionException, InterruptedException, ClassNotFoundException {
        for (int i = 0; i < 10; i++) {
            var future = producer
                    .send(new ProducerRecord<>(
                            TOPIC, "Message " + i, "Some message")).get();
            printFutureValues(future);
            System.out.println("------------------------");
        }
    }

    private static void consume(KafkaConsumer<String, String> consumer) {
        new Thread(() -> {
            while (true) {
                var result = consumer.poll(Duration.ZERO);
                result.forEach(x -> System.out.println("Consuming - " + x.key() + " : " + x.value()));
            }
        }).start();
    }
}
