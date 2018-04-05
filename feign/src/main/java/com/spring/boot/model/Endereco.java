package com.spring.boot.model;

public class Endereco {

    public String cep;
    public String logradouro;
    public String complemento;
    public String bairro;
    public String localidade;
    public String uf;

    //getters 

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}