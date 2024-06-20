package br.com.ada.designpattern.proxy;

public class Run {
    public static void main(String[] args) {
        PersonService service = new PersonService(new PersonRepository());
        Person person = Person.builder()
                .firstName("First name")
                .lastName("Last name")
                .dateOfBirth("19/19/1999")
                .document("11111111111")
                .nickname("Nickname")
                .build();

        service.save(person);

        Person returnPerson = service.findById(1L);

        System.out.println(returnPerson);
    }
}
