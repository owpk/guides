package com.flamexander.rabbitmq.console.consumer;

import com.rabbitmq.client.*;

import java.nio.charset.StandardCharsets;

public class RoutingConsumerApp {
    private static final String EXCHANGE_NAME = "topic_exchange";

    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.TOPIC);
        String queueName = channel.queueDeclare().getQueue();


        String routingKey = "com.gb.*";
        channel.queueBind(queueName, EXCHANGE_NAME, routingKey);
        System.out.println(" [*] Waiting for messages with routing key (" + routingKey + "):");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
            System.out.println(" [x] Received '" + delivery.getEnvelope().getRoutingKey() + "':'" + message + "'");

        };
        channel.basicConsume(queueName, true, deliverCallback, consumerTag -> {
        });
    }
}
