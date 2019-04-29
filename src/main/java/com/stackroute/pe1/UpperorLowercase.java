package com.stackroute.pe1;

import java.util.Scanner;

public class UpperorLowercase {
    public static String UpLow(char m)
    {
        String str1="";
        if(m >= 97 && m <= 123)
        {
            str1="Small Case Letter";
        }
        else if(m >= 65 && m <= 96)
        {
            str1="Capital Letter";
        }
        else if(m >= 48 && m <= 57)
        {
            str1="Digit";
        }
        return str1;
    }
}
