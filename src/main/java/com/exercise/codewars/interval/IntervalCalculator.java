package com.exercise.codewars.interval;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @author Sophia Klocheva
 * on 14/12/2020
 */
public class IntervalCalculator
{
    public static int sumIntervals(int[][] intervals)
    {
        if (intervals != null && intervals.length != 0)
        {
            Set<Integer> resultList = new HashSet<>();
            for (int i = 0; i < intervals.length; i++)
            {
                //count interval and add to set to remove overlapping
                for (int j = intervals[i][0] + 1; j <= intervals[i][1]; j++)
                {
                    resultList.add(j);
                }
            }
            return resultList.size();
        }
        return 0;
    }

    public static int sumIntervalsStreams(int[][] intervals)
    {
        return intervals == null ? 0 : (int) Arrays.stream(intervals)
                .flatMapToInt(interval -> IntStream.range(interval[0], interval[1]))
                .distinct()
                .count();
    }
}
