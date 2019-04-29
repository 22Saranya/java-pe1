package com.stackroute.pe1;

import java.util.Scanner;

public class LastCharRepeat {
        String new_word;
        int input2;
    public static void RepeatChar(String input1)
    {
        int len = input1.length();
        String new_word;
        new_word=input1;
        Scanner sc = new Scanner(System.in);
        int input2 = sc.nextInt();
        for(int j=0;j<input2;j++)
        {
            new_word = new_word + input1.substring(len-input2,len);

        }
        System.out.println(new_word);
    }
}
