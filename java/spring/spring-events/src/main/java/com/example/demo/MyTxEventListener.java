package com.example.demo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class MyTxEventListener {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void listen(CustomEvent event) {
        System.out.println("RECEIVED AFTER COMMIT: " + event.getMsg());
    }

    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void listenBefore(CustomEvent event) {
        System.out.println("RECEIVED BEFORE COMMIT: " + event.getMsg());
    }

    @EventListener(condition = "#event.msg == 'A'")
    public void listenIf(CustomEvent event) {
        System.out.println("Listened with condition: " + event.getMsg());
    }
}