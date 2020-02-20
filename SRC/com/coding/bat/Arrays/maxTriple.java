package com.coding.bat.Arrays;

public class maxTriple {
    //    Given an array of ints of odd length, look at the first, last,
//    and middle values in the array and return the largest. The array
//    length will be a least 1.
//
//    com.coding.bat.Arrays.maxTriple([1, 2, 3]) → 3
//    com.coding.bat.Arrays.maxTriple([1, 5, 3]) → 5
//    com.coding.bat.Arrays.maxTriple([5, 2, 3]) → 5
    int[] arr = {};
    int len;

    public maxTriple(int[] arr) {
        this.arr = arr;
        len = arr.length;
    }

    public boolean isArrayEmpty() {
        return len == 0;
    }

    public boolean isArrayLengthOdd() {

        return len % 2 != 0;
    }

    public int getMaxTriple() {
        return Math.max(arr[0], Math.max(arr[len / 2], arr[len - 1]));
    }
}
