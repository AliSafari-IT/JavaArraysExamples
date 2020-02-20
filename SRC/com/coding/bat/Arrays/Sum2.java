package com.coding.bat.Arrays;

public class Sum2 {
    int[] arr = {};

    public Sum2(int[] arr) {
        this.arr = arr;
    }

    public Number sumUp2Elements() {
        if (arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];
        return arr[0] + arr[1];
    }
}
