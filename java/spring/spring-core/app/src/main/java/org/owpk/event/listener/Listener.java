package org.owpk.event.listener;

import org.owpk.event.Event;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Listener implements ApplicationListener<Event> {

    @Override
    public void onApplicationEvent(Event event) {
        System.out.println(event.getMsg());
    }
}
