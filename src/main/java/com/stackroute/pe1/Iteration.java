package com.stackroute.pe1;

import java.util.Scanner;

public class Iteration {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please enter any Number:");
        n = sc.nextInt();
        Iter(n);
    }
    public static void Iter(int n)
    {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
            }
        }
    }
}
