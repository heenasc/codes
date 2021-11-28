package com.company;

import java.util.Random;
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String coffee = "Espresso";

        switch (coffee) {
            case "Cappuccino":
                System.out.println("Preparing Cappuccino!");
                break;
            case "Espresso":
                System.out.println("Preparing Espresso!");
                break;
            case "Latte":
                System.out.println("Preparing Latte!");
                break;
            case "Black Coffee":
                System.out.println("Preparing Black Coffee!");
                break;
            default:
                System.out.println("Please select a valid option...");
                break;
        }


            //Scanner input= new Scanner(System.in);
        {
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Hufflepuff ");
                    break;
                case 2:
                    System.out.println("Gryffindor ");
                    break;
                case 3:
                    System.out.println("Slytherin");
                    break;
                case 4:
                    System.out.println("Ravenclaw ");
                    break;
                default:
                    System.out.println(" Enter a number from 1 to 4");
                    break;
            }
        }
        {
            int day = sc.nextInt();

            switch(day) {

                case 1:
                    System.out.print("Work Day-Monday");
                    break;
                case 2:
                    System.out.print("Work Day-Tuesday");
                    break;
                case 3:
                    System.out.print("Work Day-Wednesday");
                    break;
                case 4:
                    System.out.print("Work Day-Thursday");
                    break;
                case 5:
                    System.out.print("Work Day-Friday");
                    break;
                default:
                    System.out.print("Yayy-Weekend");
                    break;
            }
        }

    }
}
