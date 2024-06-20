package br.com.dio.designpattern.facade.subsystem;

import lombok.Getter;

public class CepApi {
    @Getter
    private static final CepApi INSTANCE = new CepApi();

    private CepApi(){
        super();
    }

    public String getCity(String cep){
        return "Macéio";
    }

    public String getState(String cep){
        return "AL";
    }
}
