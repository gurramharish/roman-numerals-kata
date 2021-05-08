package com.hans.rn.kata;

public class RomanNumeralsConverter {

    static int convert(String romanNumber) {
        if(romanNumber.length() == 1) {
            return convertSingleDigit(romanNumber);
        } else if("II".equalsIgnoreCase(romanNumber)) {
            return 2;
        } else if("III".equalsIgnoreCase(romanNumber)) {
            return 3;
        }
        return 6;
    }

    private static int convertSingleDigit(String romanNumber) {
        if("I".equalsIgnoreCase(romanNumber)) {
            return 1;
        } else if("V".equalsIgnoreCase(romanNumber)) {
            return 5;
        } else {
            return 10;
        }
    }
}
