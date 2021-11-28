package com.company;

import java.util.Scanner;

public class prime {
    public static void primes(int num){
        int result=0;
        int i,j=0;
        for(i=2;i<=num;i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j)
                System.out.println("all prime upto num"+j);
        }

    }
    public static String primeone(int num){
        boolean primecheck = true;
        String result;
        for (int i = 2; i < Math.sqrt(num); i++) {
            // condition for nonprime number
            if (num % i == 0) {

                primecheck = false;
                break;
            }
        }

        if (primecheck == true) {
            result = "Prime";
        } else {
            result = "Not a prime";
        }
        return result;
    }
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number you wish to check : ");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        primes(num);
        System.out.println(primeone(num));

    }
}
