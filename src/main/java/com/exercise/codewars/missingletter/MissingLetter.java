package com.exercise.codewars.missingletter;

/**
 * @author Sophia Klocheva
 * on 04/12/2020
 */
public class MissingLetter
{
    private static Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static char findMissingLetter(char[] array)
    {
        for (int i = 0; i < alphabet.length; i++)
        {
            if (Character.toUpperCase(array[0]) == Character.toUpperCase(alphabet[i]))
            {
                for (int j = 0; j < array.length; j++)
                {
                    if (Character.toUpperCase(alphabet[i]) != (Character.toUpperCase(array[j])))
                    {
                        if (Character.isUpperCase(array[j]))
                        {
                            return Character.toUpperCase(alphabet[i]);
                        }
                        else
                        {
                            return alphabet[i];
                        }
                    }
                    i++;
                }
            }
        }
        return ' ';
    }
}
