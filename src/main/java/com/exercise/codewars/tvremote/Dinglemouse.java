package com.exercise.codewars.tvremote;

/**
 * @author Sophia Klocheva
 * on 04/12/2020
 * <p>
 * My TV remote control has arrow buttons and an OK button.
 * I can use these to move a "cursor" on a logical screen keyboard to type "words"
 * <p>
 * The cursor always starts on the letter a (top left)
 * Remember to also press OK to "accept" each character.
 * Take a direct route from one character to the next
 * The cursor does not wrap (e.g. you cannot leave one edge and reappear on the opposite edge)
 * A "word" (for the purpose of this Kata) is any sequence of characters available on my virtual "keyboard"
 * <p>
 * a	b	c	d	e	1	2	3
 * f	g	h	i	j	4	5	6
 * k	l	m	n	o	7	8	9
 * p	q	r	s	t	.	@	0
 * u	v	w	x	y	z	_	/
 * <p>
 * possible solution:
 * position g [1],[1] - p[0][3] =
 * positive results of [1-0=1]+[1-(-3)=2] = 3, jumps needed for the fastest route
 */
public class Dinglemouse
{
    public static int tvRemote(final String word)
    {
        int arrRow = 5;
        int arrCol = 8;
        String[] characters = word.split("");
        String[][] keyboard = {{"a", "b", "c", "d", "e", "1", "2", "3"}
                , {"f", "g", "h", "i", "j", "4", "5", "6"}
                , {"k", "l", "m", "n", "o", "7", "8", "9"}
                , {"p", "q", "r", "s", "t", ".", "@", "0"}
                , {"u", "v", "w", "x", "y", "z", "_", "/"}};

        int prevI = 0;
        int prevJ = 0;
        int buttonClicks = 0;
        String character = null;
        for(int chP = 0; chP<characters.length; chP++)
        {
            character = characters[chP];
            for (int i = 0; i < arrRow; i++)
            {
                for (int j = 0; j < arrCol; j++)
                {
                    if(keyboard[i][j].equals(character))
                    {
                        int clicks = Math.abs(prevI - i) + Math.abs(prevJ - j) + 1;
                        buttonClicks = buttonClicks + clicks;
                        prevI = i;
                        prevJ = j;
                    }
                }
            }
        }

        return buttonClicks;
    }
}
