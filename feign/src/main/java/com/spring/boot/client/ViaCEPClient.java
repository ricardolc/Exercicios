package com.spring.boot.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.spring.boot.model.Endereco;


@FeignClient(url="https://viacep.com.br/ws/", name = "viacep")
public interface ViaCEPClient {

    @GetMapping("{cep}/json")
    Endereco buscaEnderecoPor(@PathVariable("cep") String cep);
}

//@Component
//public class ViaCEPClient {
//
//    public Endereco buscaEnderecoPor(String cep){
//        RestTemplate template = new RestTemplate();
        
//        String s = template.getForObject("http://viacep.com.br/ws/03692040/json",String.class, cep);
//        Endereco e = template.getForObject("http://viacep.com.br/ws/03692040/json",Endereco.class, cep);
//        return template.getForObject("http://viacep.com.br/ws/03692040/json",Endereco.class, cep);
//    }
//}