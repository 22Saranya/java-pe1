package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome objpal=new Palindrome();
    String str;


    @Test
    public void greatpal() {
        str=objpal.FindPalindrome(2468642);
        assertEquals("Number is a palindrome and the sum of even number is greater than 25",str);
    }

    @Test
    public void lesspal() {
        str=objpal.FindPalindrome(123454321);
        assertEquals("Number is a palindrome and the sum of even number is less than 25",str);
    }

    @Test
    public void notpal() {
        str=objpal.FindPalindrome(12345);
        assertEquals("Number is not palindrome",str);
    }
}