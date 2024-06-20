package br.com.ada.designpattern.proxy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private String lastName;
    private String firstName;
    private String nickname;
    private String dateOfBirth;
    private String document;
}
