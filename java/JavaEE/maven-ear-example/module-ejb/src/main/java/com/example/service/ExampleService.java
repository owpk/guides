package com.example.service;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Queue;

@Stateless(name = "exampleService")
public class ExampleService {

    @Resource(name = "jms/system/connectionFactory")
    private ConnectionFactory cf;

    @Resource(name = "java:/jms/system/request")
    private Queue requestQueue;


    public String sendMsg(String messageTxt) throws JMSException {
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("CONNECTION F: " + cf);
        System.out.println("QUEUE: " + requestQueue);
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        var connection = cf.createConnection();
        var session = connection.createSession();
        var prod = session.createProducer(requestQueue);
        var msg = session.createTextMessage();
        msg.setText(messageTxt);
        prod.send(msg);
        return "OK";
    }

}