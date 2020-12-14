package com.exercise.codewars.timeconverter;

/**
 * @author Sophia Klocheva
 * on 14/12/2020
 */
public class ReadableTimeConverter
{
    public static String makeReadable(int seconds)
    {
        int hour = (seconds / 60) / 60;
        seconds = seconds - (hour * 60) * 60;
        int minutues = seconds / 60;
        seconds = seconds - minutues * 60;
        return String.format("%02d:%02d:%02d", hour, minutues, seconds);
    }

    public static String makeReadable2(int seconds) {
        // Do something
        int hour = seconds / 3600;
        double remainder = seconds - hour * 3600;
        int minutes = (int) remainder / 60;
        remainder = remainder - minutes * 60;
        return String.format("%02d:%02d:%02d", hour, minutes, (int)remainder);
    }

}
