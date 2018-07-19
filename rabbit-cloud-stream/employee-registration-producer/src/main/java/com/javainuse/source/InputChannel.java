package com.javainuse.source;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InputChannel {
  
	@Input
    SubscribableChannel input();
}