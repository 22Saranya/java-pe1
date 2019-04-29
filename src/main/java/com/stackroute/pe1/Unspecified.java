package com.stackroute.pe1;

import java.util.Scanner;

public class Unspecified {
    public static void main(String args[]){
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the range number");
        n=in.nextInt();
        Add(n);
    }
    public static void Add(int n){

        int insert,sum=0;
        int[] addnum=new int[n];
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        for (insert=0;insert<n;insert++){
            addnum[insert]=in.nextInt();
            sum +=addnum[insert];
        }

        System.out.println(sum);
    }
}
