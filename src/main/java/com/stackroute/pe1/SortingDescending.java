package com.stackroute.pe1;
import java.util.Scanner;

public class SortingDescending {
    public static void main(String args[]) {

        int n;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a large number:");
        n = s.nextInt();
        Descending(n);
    }
    public static void Descending(int n)
    {
        int  temp, sum = 0, i, r, j;
        int len = Integer.toString(n).length();
        int a[] = new int[len];
        for(j=0;j<len;j++){
            a[j]=n%10;
            n=n/10;
            if(a[j]%2==0)
            {
                sum=sum+a[j];

            }

        }

        for ( i = 0; i < len; i++)
        {
            for ( j = i + 1; j < len; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Sorted number in non increasing Order: ");
        for ( i = 0; i < len; i++)
        {
            System.out.print(a[i] + ",");
        }

        System.out.println("The sum of even numbers is: "+sum);
        if(sum>15)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}
