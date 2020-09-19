package com.ncu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L1431KidsWithGreatestNumberCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for(int temp:candies){
            max = Math.max(max,temp);
        }
        for(int temp:candies){
            list.add(temp+extraCandies>=max);
        }
        return list;
    }
    public List<Boolean> kidsWithCandies2(int[] candies,int extraCandies){
        int max = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).mapToObj(candy->candy + extraCandies>=max).collect(Collectors.toList());
    }
}
