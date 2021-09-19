package pl.sdacademy.unit.test.basic.exercises.unit.task1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void shouldReturnTrueIfStringIsEmpty() {
        //given
        String input = "";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result);
        assertThat(result).isTrue();
        
    }
}