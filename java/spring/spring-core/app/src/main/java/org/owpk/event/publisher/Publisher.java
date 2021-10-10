package org.owpk.event.publisher;

import org.owpk.event.Event;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Publisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisherAware;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisherAware = applicationEventPublisher;
    }

    public void sendMsg(String msg) {
        publisherAware.publishEvent(new Event(this, msg));
    }
}
