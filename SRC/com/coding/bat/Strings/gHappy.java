package com.coding.bat.Strings;

public class gHappy {
    //
//    We'll say that a lowercase 'g' in a string is "happy" if there is
//    another 'g' immediately to its left or right. Return true if all
//    the g's in the given string are happy.
//
//
//    gHappy("xxggxx") → true
//    gHappy("xxgxx") → false
//    gHappy("xxggyygxx") → false

    String str;

    public gHappy(String str) {
        this.str = str;
    }


    public boolean isGHappy() {
        // Creating array of string length
        char[] ch = new char[str.length()];
        boolean happy = true;
        int len = str.length();
        // Copy character by character into array
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
        }
        for (int i = 0; i < len; i++) {
            if (str == "g") return false;
            if (str.endsWith("g") && ch[len - 2] != 'g') return false;
            if (i > 0 && ch[i] == 'g') {
                if (i < len - 1) {
                    if (ch[i - 1] == 'g' || ch[i + 1] == 'g') {
                        happy = true;
                    } else if (ch[len - 1] == 'g') {
                        if (ch[i + 1] == 'g') {
                            happy = true;
                        }
                    } else {
                        happy = false;
                    }
                }
            }
        }
        return happy;
    }
}
