package com.coding.bat.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maxTripleTest {
    maxTriple m3ple;

    @Test
    void isArrayEmpty() {
        m3ple = new maxTriple(new int[]{});
        assertTrue(m3ple.isArrayEmpty());
    }

    @Test
    void isArrayLengthOdd() {
        m3ple = new maxTriple(new int[]{1, 5, 7, 8, 11});
        assertTrue(m3ple.isArrayLengthOdd());
    }

    @Test
    void arrayLengthOne() {
        m3ple = new maxTriple(new int[]{21});
        assertEquals(21, m3ple.getMaxTriple());
    }

    @Test
    void getMaxTriple() {
        m3ple = new maxTriple(new int[]{1, 5, 7, 8, 11});
        assertEquals(11, m3ple.getMaxTriple());
    }

}