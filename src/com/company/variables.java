package com.company;

import java.util.Scanner;

public class variables {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        {
            //typecasting
            System.out.print("enter value of int a,b,c");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(a * b + c);
            float x = a;
            System.out.println(x);
            int y = (int) x;
            System.out.println(y);
            System.out.print("enter value of double");
            double d = sc.nextDouble();
            float z = (float) d;
            System.out.println(z);
        }
        {
            //celcious to ferenhit
            System.out.print("enter value of int c");
            int c = sc.nextInt();
            float f =9*(float) c / 5 + 32;
            System.out.println(f);
        }
        {
            int []marks;
            marks=new int[5];
            System.out.println("enter value of array of size five");
            marks[0]=sc.nextInt();
            marks[1]=sc.nextInt();
            marks[2]=sc.nextInt();
            marks[3]=sc.nextInt();
            marks[4]=sc.nextInt();
            System.out.println("marks"+marks[4]);

        }
    }
}
