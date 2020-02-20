package com.coding.bat.Arrays;

public class MakeEnds {
    //Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
// The original array will be length 1 or more.
    int[] arr = {};

    public MakeEnds(int[] arr) {
        this.arr = arr;
    }

    public MakeEnds() {
    }

    public int[] makeEnds() {
        return new int[]{arr[0], arr[arr.length - 1]};
    }
}
