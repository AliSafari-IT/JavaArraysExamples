package com.coding.bat;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BigDifference {

//
//Given an array length 1 or more of ints, return the difference between
//    the largest and smallest values in the array. Note: the built-in
//    Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or
//    larger of two values.


    //    BigDifference([10, 3, 5, 6]) → 7
//    BigDifference([7, 2, 10, 9]) → 8
//    BigDifference([2, 10, 7, 2]) → 8
    private int[] nums;

    public BigDifference(int[] nums) {
        this.nums = nums;
    }

    public int getMaxDiff() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int nr : nums
        ) {
            arrayList.add(nr);
        }
        Collections.sort(arrayList);
        return arrayList.get(nums.length - 1) - arrayList.get(0);
    }
}
