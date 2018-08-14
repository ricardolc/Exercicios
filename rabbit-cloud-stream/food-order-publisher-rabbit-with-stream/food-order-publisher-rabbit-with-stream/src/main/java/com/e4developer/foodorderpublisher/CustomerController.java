package com.e4developer.foodorderpublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerSource customerSource;

    @RequestMapping("/customer")
    @ResponseBody
    public String orderFood(@RequestBody Client client){
    	customerSource.customerOrder().send(MessageBuilder.withPayload(client).build());
        System.out.println(client.toString());
        return "customer ordered!";
    }
}
