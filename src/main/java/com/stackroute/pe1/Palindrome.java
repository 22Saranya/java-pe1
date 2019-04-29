package com.stackroute.pe1;
import java.util.Scanner;

public class Palindrome {
    public static String FindPalindrome(int n)
    {
        String strpal="";
        int r, sum = 0, temp, even = 0;
        temp = n;
        while (n > 0) {

            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
            if (r % 2 == 0) {
                even = even + r;
            }

        }
        if(sum==temp)
        {
        if ((even > 25))
        {
            strpal="Number is a palindrome and the sum of even number is greater than 25";
        }
        else if (even < 25)
        {
            strpal="Number is a palindrome and the sum of even number is less than 25";
        }
    }
    else
    {
        strpal="Number is not palindrome";
    }
    return strpal;
    }
}
