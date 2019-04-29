package com.stackroute.pe1;
import java.util.Scanner;

public class ReverseString {

    public static String RevString(String sc)
    {
        String reverse="";

        int length = sc.length();

        for (int i = length - 1 ; i >= 0 ; i--) {
            reverse = reverse + sc.charAt(i);
        }
        return reverse;
    }

}
