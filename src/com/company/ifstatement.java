package com.company;

import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        {
            if (number >= 0) {
                System.out.println("its positive");

            } else {
                System.out.println("number is negative");
            }
            if (number % 2 == 0) {
                System.out.println("num is even");
            } else {
                System.out.println("number is odd");
            }
            {
                int n1, n2, n3;
                System.out.println("enter 3 ineger in inc order or dec");
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                n3 = sc.nextInt();
                if(n1<n2&&n2<n3)
                {
                    System.out.println("number in increasing");
                }
                else
                {
                    System.out.println("number in decreasing");

                }
            }


        }
    }
}
