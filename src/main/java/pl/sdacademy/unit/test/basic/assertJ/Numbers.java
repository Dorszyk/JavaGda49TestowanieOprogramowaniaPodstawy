package pl.sdacademy.unit.test.basic.assertJ;

import java.util.OptionalInt;

public class Numbers {

    public OptionalInt findFirstDigit(final String number) {
        return number.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .findFirst();
    }
}
