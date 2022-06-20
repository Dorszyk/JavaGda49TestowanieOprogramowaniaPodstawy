package pl.sdacademy.unit.test.basic.examples;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String prefix;
    private String firstName;
    private String lastName;
}
