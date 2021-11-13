package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int length = Math.min(word.length, pref.length);
        for (int index = 0; index < length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
