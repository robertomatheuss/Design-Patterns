package br.com.dio.designpattern.facade.subsystem;

import lombok.AllArgsConstructor;
import lombok.Builder;

public class ServiceCRM {

    private ServiceCRM(){
        super();
    }

    @AllArgsConstructor
    @Builder
    public static class Client {
        private String name;
        private String state;
        private String city;
        private String cep;
    }
    public static void recordClient(Client client){
        System.out.println("Client saved in the system");
    }
}
