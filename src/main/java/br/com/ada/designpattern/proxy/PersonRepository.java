package br.com.ada.designpattern.proxy;

import java.util.HashMap;
import java.util.Map;

public class PersonRepository {
    private Map<Long, Person> bank = new HashMap<>();

    private static Long countId = 1L;

    public void save(Person person){
        bank.put(countId++,person);
    }
    public Person findById(Long id){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return bank.get(id);
    }
}
