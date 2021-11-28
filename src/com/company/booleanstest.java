package com.company;

import java.util.Scanner;

public class booleanstest {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            boolean z = (x + y > 30);
            System.out.println(z);
        }
        {
            //Take Multiple String Input
            System.out.println("\nenter string size of 4: ");
            String[] string = new String [4];
//consuming the <enter> from input above
            //sc.nextLine();
            for (int i = 0; i <4; i++)
            {
                string[i] = sc.nextLine();
            }
            System.out.println("\nYou have entered: ");
//for-each loop to print the string
            for(String str: string)
            {
                System.out.println(str);
            }



        }
    }
}



