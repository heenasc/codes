package com.company;
import java.util.Scanner;

public class stringcode {
    public static void main(String[] args) {
        {
            System.out.println("Write a program to count the number of instances a character appears in an input string.");
            int count = 0;
            Scanner s = new Scanner(System.in);
            String sentence = s.nextLine();
            char word = s.next().charAt(0);
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == word)
                    count++;
            }

            System.out.println(count);
        }
        {
            String str="heena";

            char ch[]=str.toCharArray();//convert string to char array for reverse loop
            String revrse="";
             for(int i=ch.length-1;i>=0;i--){
                revrse+=ch[i];
                }
            //Print the reversed string.
            System.out.println(revrse);
        }
        {
            System.out.println("Write a program to search a number in the array given below. ");
            int n, x;
            int[] numberArray = {1,15,90,40,35,63,79,88,20};
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int len = numberArray.length;
            int  isPresent = 0,i;
            for(i = 0; i < len; i++)
            {
                if(numberArray[i] == n)
                {
                    isPresent = 1;
                    break;
                }
                else
                {
                    isPresent = 0;
                }
            }
            //Done: Display whether the number is present or not.
            if(isPresent == 1)
            {
                System.out.println((i + 1));
            }
            else
            {
                System.out.println("Number not found");
            }
        }

    }
}
