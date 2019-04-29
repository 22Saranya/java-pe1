package com.stackroute.pe1;
import java.util.Scanner;

public class EvenorOdd {

    public static String CheckEven(int n)
    {    String str="";
        if (n > 20 && n < 30)
        {
            if (n % 2 == 0)
            {
                str = "Jerry";
            } else {
                str = "Tom";
            }
        }
         else {
            str = "Neither Tom nor Jerry";
        }
        return str;
    }

    }
