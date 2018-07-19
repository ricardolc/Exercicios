package com.javainuse.source;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(InputChannel.class)
public class MessageHandler {
    @StreamListener(Sink.INPUT)
    public void handle(String message) {
       // log.info("message received {}", message);
        System.out.println(message);
    }
}