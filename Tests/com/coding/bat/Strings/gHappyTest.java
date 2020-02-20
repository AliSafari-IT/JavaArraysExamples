package com.coding.bat.Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class gHappyTest {
//
//    We'll say that a lowercase 'g' in a string is "happy" if there is
//    another 'g' immediately to its left or right. Return true if all
//    the g's in the given string are happy.
//
//
//    gHappy("xxggxx") → true
//    gHappy("xxgxx") → false
//    gHappy("xxggyygxx") → false

    gHappy happy;

    @Test
    void gIsHappy1() {
        happy = new gHappy("xxgggxyz");
        assertTrue(happy.isGHappy());
    }

    @Test
    void gIsHappy2() {
        happy = new gHappy("");
        assertTrue(happy.isGHappy());
    }

    @Test
    void gIsHappy3() {
        happy = new gHappy("g");
        assertFalse(happy.isGHappy());
    }

    @Test
    void gIsHappy4() {
        happy = new gHappy("xxgggxyg");
        assertFalse(happy.isGHappy());
    }

}