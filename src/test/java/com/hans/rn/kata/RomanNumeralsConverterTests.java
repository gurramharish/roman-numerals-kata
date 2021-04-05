package com.hans.rn.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanNumeralsConverterTests {

    @Test
    public void isJunitWorking() {
        assertTrue(true);
    }

    @DisplayName("Roman numerals I, V, X Tests")
    @ParameterizedTest(name = "Input: {0}, Expected: {1}")
    @CsvSource({"I, 1", "V, 5", "X, 10"})
    public void convertsSingleRomanDigit(String input, int expected) {
        int arabic = RomanNumeralsConverter.convert(input);
        assertEquals(expected, arabic);
    }

}
