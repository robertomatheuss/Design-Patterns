package br.com.ada.designpattern.proxy.solution;

import br.com.ada.designpattern.proxy.Person;
import br.com.ada.designpattern.proxy.PersonRepository;

public class ProxyRepositoryPerson extends PersonRepository {

    @Override
    public void save(Person person) {
        super.save(person);
    }

    @Override
    public Person findById(Long id) {
        return super.findById(id);
    }
}
