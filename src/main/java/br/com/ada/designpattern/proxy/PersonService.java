package br.com.ada.designpattern.proxy;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public void save(Person person){
        personRepository.save(person);
    }

    public Person findById(Long id){
        return personRepository.findById(id);
    }
}
