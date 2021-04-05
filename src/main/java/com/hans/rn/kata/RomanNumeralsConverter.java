package com.hans.rn.kata;

public class RomanNumeralsConverter {
    static int convert(String romanNumber) {
        if("I".equalsIgnoreCase(romanNumber)) {
            return 1;
        } else if("V".equalsIgnoreCase(romanNumber)) {
            return 5;
        } else {
            return 10;
        }
    }
}
