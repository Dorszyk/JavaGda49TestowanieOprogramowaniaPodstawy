package pl.sdacademy.unit.test.basic.examples;

public class PersonFactory {

    public Person createPerson(final String firstName, final String lastName) {
        final String prefix = firstName.endsWith("a") ? "Ms" : "Mr";
        return new Person(prefix, firstName, lastName);
    }

}
