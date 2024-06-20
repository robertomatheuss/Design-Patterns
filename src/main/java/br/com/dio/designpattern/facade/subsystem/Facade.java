package br.com.dio.designpattern.facade.subsystem;

public class Facade {

    public void migrateClient(String name,String cep){
        String city = CepApi.getINSTANCE().getCity(cep);
        String state = CepApi.getINSTANCE().getState(cep);

        ServiceCRM.recordClient(new ServiceCRM.Client.ClientBuilder()
                .cep(cep)
                .city(city)
                .state(state)
                .name(name)
                .build() );
    }
}
