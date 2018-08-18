package com.e4developer.foodorderpublisher;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface FoodOrderSource {

    @Input("foodOrdersChannelInput")
    MessageChannel foodOrdersInput();
    
   // @Output("foodOrdersChannelOutput")
   // MessageChannel foodOrdersOutput();

}
