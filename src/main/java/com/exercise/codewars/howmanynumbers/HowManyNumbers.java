package com.exercise.codewars.howmanynumbers;

import java.util.ArrayList;
import java.util.List;

public class HowManyNumbers {

    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        long firstNumber = (long) Math.pow(10, numDigits - 1);
        long curNumber = firstNumber;
        int totalNumbers = 0;
        long firstFound = 0;
        long lastFound = 0;
        while (curNumber < firstNumber * 10) {
            if (checkSum(sumDigits, curNumber)) {
                if (totalNumbers == 0)
                    firstFound = curNumber;
                totalNumbers++;
                lastFound = curNumber;
            }
            curNumber++;
        }
        List<Long> result = new ArrayList<Long>(3);
        if (totalNumbers > 0) {
            result.add((long) totalNumbers);
            result.add(firstFound);
            result.add(lastFound);
        }
        return result;
    }

    private static boolean checkSum(int sumDigits, long number) {
        int curSum = 0;
        Integer prevDigit = null;
        int curDigit;
        while (number > 0) {
            curDigit = (int) number % 10;
            if (prevDigit != null && curDigit > prevDigit) {
                return false;
            }
            number = number / 10;
            curSum = curSum + curDigit;
            prevDigit = curDigit;
        }
        if (curSum == sumDigits)
            return true;
        else
            return false;
    }
}