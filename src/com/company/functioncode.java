package com.company;

import java.util.Scanner;

public class functioncode {
    public static int mostVotes(int []arr){
        int max=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > arr[max])
            max = i;
        }
    return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size and its value it will give array index of max number");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int votesPerUser=mostVotes(arr);
        System.out.println(votesPerUser);


    }
}





