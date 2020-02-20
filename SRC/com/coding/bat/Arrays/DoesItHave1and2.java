package com.coding.bat.Arrays;

public class DoesItHave1and2 {
    private int[] nums;
//Given an array of ints, return true if there is a 1 in the array
// with a 2 somewhere later in the array.
//
//
//has12([1, 3, 2]) → true
//has12([3, 1, 2]) → true
//has12([3, 1, 4, 5, 2]) → true


    public DoesItHave1and2(int[] nums) {
        this.nums = nums;
    }

    public int isEmpty() {
        return nums.length;
    }

    public boolean check1And2() {
        int idx = 0;
        for (int k = idx; k < nums.length; k++) {
            if (nums[k] == 1) {
                idx = k;
                for (int m = idx; m < nums.length; m++) {
                    if (nums[m] == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
