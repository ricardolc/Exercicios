package com.e4developer.foodorderpublisher;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(CustomerSource.class)
public class CustomerPublisher {
}
