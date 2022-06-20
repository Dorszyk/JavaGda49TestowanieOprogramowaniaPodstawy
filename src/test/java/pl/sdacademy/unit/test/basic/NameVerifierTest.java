package pl.sdacademy.unit.test.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NameVerifierTest {

    @Test
    void shouldValidateName() {
        String name = "Andrzej";
        NameVerifier nameVerifier = new NameVerifier();

        final boolean validationResult = nameVerifier.isNameValid(name);

        assertTrue(validationResult);
    }

    @Test
    void shouldNotValidateNameWhenAllLettersAreLowerCase() {
        String name = "andrzej";
        NameVerifier nameVerifier = new NameVerifier();

        final boolean validationResult = nameVerifier.isNameValid(name);

        assertFalse(validationResult);
    }

    @Test
    void shouldNotValidateEmptyName() {
        String emptyName = "";
        NameVerifier nameVerifier = new NameVerifier();

        final boolean validationResult = nameVerifier.isNameValid(emptyName);

        assertFalse(validationResult);
    }

    @Test
    void shouldNotValidateNullName() {
        String nullName = null;
        NameVerifier nameVerifier = new NameVerifier();

        final boolean validationResult = nameVerifier.isNameValid(nullName);

        assertFalse(validationResult);
    }
}