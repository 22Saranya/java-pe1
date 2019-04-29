package com.stackroute.pe1;

import java.util.Scanner;

public class Originalnumber {

    public static String NumberGuess(int n)
    {
        String str1;
        if(n>=1 && n<=50)
        {
            str1="Number guessed matches the original number";
        }
        else if(n<1)
        {
            str1="Number guessed is less than original number";
        }
        else{
            str1="Number guessed is more than original number";
        }
        return str1;
    }
}
