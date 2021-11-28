package com.company;

public class functions {
    public static int sum(int a,int b){
        int sum=0;
        sum=(a+b);
        return sum;
    }
    public static int square(int a,int b){
        return(a+b) * (a+b);
    }
    public static void main(String[] args) {
        System.out.println(sum(4,9));
        System.out.println(square(4,9));

    }
}
