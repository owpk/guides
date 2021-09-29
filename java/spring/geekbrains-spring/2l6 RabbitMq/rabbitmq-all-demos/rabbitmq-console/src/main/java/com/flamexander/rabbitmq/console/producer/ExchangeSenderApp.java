package com.flamexander.rabbitmq.console.producer;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.nio.charset.StandardCharsets;


public class ExchangeSenderApp {
    private static final String EXCHANGE_NAME2 = "amq.topic";

    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
             channel.exchangeDeclare(EXCHANGE_NAME2, BuiltinExchangeType.DIRECT);

            String message = "info: Hello World!";

            channel.basicPublish(EXCHANGE_NAME2, "programming.best-practices.java",
                    null, message.getBytes(StandardCharsets.UTF_8));
            System.out.println(" [x] Sent '" + message + "'");
        }
    }
}