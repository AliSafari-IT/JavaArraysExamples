package com.coding.bat.Strings;

public class CountYZ {
    String str;
    int xyWords;

    public CountYZ(String str) {
        this.str = str;
    }


    public int countYZ() {
        str = str.toLowerCase();
        int len = str.length();
        StringBuilder delimiter = new StringBuilder("[");
        char[] chArr = new char[len];
        for (int i = 0; i < len; i++) {
            chArr[i] = str.charAt(i);
            if (!Character.isLetter(chArr[i])) {
                delimiter.append(chArr[i]);
            }
        }
        if (delimiter.length() == 1) {
            delimiter.replace(0, 1, " ");
        } else {
            delimiter.append("]+");
        }
        String[] words = str.split(String.valueOf(delimiter.toString()));
        int count = 0;
        if (words.length > 0) {
            for (String w : words
            ) {
                if (w.endsWith("y") || w.endsWith("z")) count++;
            }
        }
        return count;
    }
}
