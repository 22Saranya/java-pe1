package com.stackroute.pe1;
import java.util.Scanner;

public class VowelorConsonant {

    public static String FindVowel(char ch)
    {
        String vow;
        {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow= "Vowel";
            } else {
                vow= "Consonant";
            }
            return vow;
        }
    }
}
