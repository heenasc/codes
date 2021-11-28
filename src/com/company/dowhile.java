package com.company;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            System.out.println("do wile loop to reverse print");
            int i=5;

        do{
            System.out.println(i);
            i--;
        }while(i>=0);

        }
        {
            System.out.println("Write a code that prints the highest power of 2, less than or equal to a given number. For e.g., if the input number is 9, the code should print 8, as 8 or  23 is the highest power of two which is less than 9. ");

            int number = sc.nextInt();
            int result = 1;
            if(number >= 2) {

                while (result * 2 <= number) {
                    result = result * 2;
                }

                System.out.println(result);

            } else {
                System.out.print("Please enter an integer >= 2");
            }

        }
        {
            int num, min,max;
            int[] array = {156, 171, 260, 95, 244, 296, 137, 180, 198, 61, 70, 283, 276, 55,
                    + 100, 59, 278, 191, 109, 110, 158, 206, 77, 279, 53, 117, 217, 214, 107, 99, 222,
                    + 275, 179, 213, 199, 139, 174, 286, 176, 155, 237, 256, 251, 187, 249, 215, 211, 113,
                    + 144, 50, 148, 49, 170, 236, 219, 106, 71, 263, 145, 231, 190, 165, 239, 41, 177, 297,
                    + 184, 193, 287, 202, 161, 189, 79, 232, 154, 153, 208, 72, 143, 300, 233, 124, 75,
                    + 277, 63, 130, 86, 242, 203, 116, 196, 289, 146, 273, 268, 56, 104, 173, 134, 194};
            min = array[0];
            max= array[0];

            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
                if(max < array[i])
                    max=array[i];
            }

            System.out.println("Minimum value: " + min);
            System.out.println("Maxmum value: " + max);

        }
    }
}
