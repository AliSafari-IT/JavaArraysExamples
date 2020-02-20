package com.coding.bat.Arrays;

public class countEvens {
    private int[] nums;
    private int len;

    public countEvens(int[] nums) {
        this.nums = nums;
        len = nums.length;
    }


    public boolean isArrayEven() {
        return len % 2 == 0;
    }

    public boolean isArrayNotEmpty() {
        return len != 0;
    }

    public int countEvenNumbers() {
        int counter = 0;
        for (int nr : nums
        ) {
            if (nr % 2 == 0) counter++;
        }
        return counter;
    }
}
