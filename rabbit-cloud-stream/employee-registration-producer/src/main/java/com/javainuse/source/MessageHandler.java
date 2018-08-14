package com.javainuse.source;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class MessageHandler {
	@StreamListener(target = Sink.INPUT)
    public void handle(String message) {
       // log.info("message received {}", message);
        System.out.println("queue recepted " + message);
    }
}