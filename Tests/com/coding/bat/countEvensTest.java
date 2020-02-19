package com.coding.bat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class countEvensTest {
//
//Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
//
//
//    countEvens([2, 1, 2, 3, 4]) → 3
//    countEvens([2, 2, 0]) → 3
//    countEvens([1, 3, 5]) → 0

    countEvens evens;

    @Test
    void isArrayNotEmpty() {
        evens = new countEvens(new int[]{1, 5, 7, 8, 11, 15});
        assertTrue(evens.isArrayNotEmpty());
    }

    @Test
    void countEvens() {
        evens = new countEvens(new int[]{1, 5, 7, 8, 11, 15, 2});
        assertEquals(2, evens.countEvenNumbers());
    }
}