package com.company;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            System.out.println("odd number till 25");
            int i = 0;
            while (i <= 25) {
                if (i % 2 != 0)
                    System.out.println(i);
                i++;
            }
        }
        {
            System.out.println("//print n number of natural number");
            int n = sc.nextInt();
            int i = 0;
            while (i <= n) {
                System.out.println(i);
                i++;
            }
        }
        {
                System.out.println("n multiples of x");
                int x=sc.nextInt();
                int y=sc.nextInt();
                int i=0;
                while(i<=y) {
                    System.out.println(i*x);
                    i++;
                }
            }
        {
            System.out.println("Write a Java program to print all alphabets from a to z in lowercase.");
            int i=97;
            while(i<=122){
                System.out.println((char) i);
                i++;
            }
        }
        {
            System.out.println("Write a code that prints the numbers between 2,000 and 3,000, which are divisible by 8 but not by 6.");
            for(int i=2000;i<=3000;i++){
                if(i%8==0 && i%6!=0){
                    System.out.println(i);
                }
            }
        }
        {
            System.out.println("Write a program that prints the sum of first n numbers");
            int n=sc.nextInt();
            int sum=0;
            for(int i=0;i<=n;i++) {
                sum = sum + i;
                System.out.println(sum);
            }
        }
        {
            System.out.println("reverse loop");
            for(int i=5;i>=0;i--){
                System.out.println(i);
            }
        }
        {
            System.out.println("average of n number");
            int n=sc.nextInt();
            int sum=0,number;
            for (int i=0;i<n;i++){
                number=sc.nextInt();
                sum=sum+number;
            }
            int average=sum/n;
            System.out.print(average);
        }

    }
}
