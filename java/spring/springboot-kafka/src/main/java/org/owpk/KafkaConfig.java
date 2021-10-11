package org.owpk;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.Properties;

@Configuration
public class KafkaConfig {

    @Bean(name = "kafkaProperties")
    public Properties kafkaCommonPropertiesBean() {
        var props = new Properties();
        props.putAll(Map.of(
               CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092"));
        return props;
    }

    @Bean(destroyMethod = "close")
    public KafkaProducer<String, String> kafkaProducerBean() {
        var props = kafkaCommonPropertiesBean();
        props.put(ProducerConfig.CLIENT_ID_CONFIG, "demo kafka spring boot");
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        return new KafkaProducer<>(props) {
            private boolean closed = false;

            @Override
            public void close() {
                if (!closed)
                    System.out.println("closing kafka producer... ");
                closed = true;
                super.close();
            }
        };
    }

    @Bean(destroyMethod = "close")
    public KafkaConsumer<String, String> kafkaConsumerBean() {
        var props = kafkaCommonPropertiesBean();
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "consumer spring boot");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.ALLOW_AUTO_CREATE_TOPICS_CONFIG, "true");
        props.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, "500");
        props.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, "1000");
        return new KafkaConsumer<>(props) {
            private boolean closed = false;
            @Override
            public void close() {
                if (!closed)
                    System.out.println("closing kafka consumer... ");
                closed = true;
                super.close();
            }
        };
    }
}
