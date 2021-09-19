package pl.sdacademy.unit.test.basic.exercises.unit.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    final Calculator calc = new Calculator();

    @Test
    void sumTest() {
        Assertions.assertEquals(4, calc.add(2, 2));
    }

    @Test
    void minusTest() {
        Assertions.assertEquals(0, calc.subtract(2, 2));
    }

    @Test
    void mnozTest() {
        Assertions.assertEquals(8, calc.multiply(2, 4));
    }

    @Test
    void dzielTest() {
        Assertions.assertEquals(2, calc.divide(8, 4));
    }


}