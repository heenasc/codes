package com.company;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        int a,b,result;
        char operator;
        Scanner sc=new Scanner(System.in);
        System.out.println("wap to create calculator using switch case");
        System.out.println("enter value of int a,b and operator ");
        a= sc.nextInt();
        b=sc.nextInt();
        operator=sc.next().charAt(0);
        switch (operator){
            case '+':
                result=a+b;
                System.out.println(result);
                break;
            case '-':
                result=a-b;
                System.out.println(result);
                break;
            case '*':
                result=a*b;
                System.out.println(result);
                break;
            case '/':
                result=a/b;
                System.out.println(result);
                break;
            case '%':
                result=a%b;
                System.out.println(result);
                break;
            default:
                System.out.println("invalid input");


        }
        {
            System.out.println("if else statement");
            System.out.println("enter your age to check your eligiblity");
            int age=sc.nextInt();
            if(age>=21)
                System.out.println("you are eligible ");
            System.out.println("you are not eligible");

        }
        {
            System.out.println("enter length and breadth for square or rectangular");
            Scanner input = new Scanner(System.in);
            int length=input.nextInt();
            int breadth=input.nextInt();

            //wrire your code here.
            if (length==breadth){
                System.out.println("Square");
            }
            else {
                System.out.println("Rectangle");
            }
        }
        {
            System.out.println("wap to check its working day or holiday using switch case");
            System.out.println("enter month and date to find workingday or not");
            String month = sc.next();
            // Enter date
            int date = sc.nextInt();

            int day = 0;
            switch (month) {
                case "January":
                    day = date;
                    break;
                case "February":
                    day = 31 + date;
                    break;
                case "March":
                    day = 31 + 28 + date;
                    break;
                case "April":
                    day = 31 + 28 + 31 + date;
                    break;
                case "May":
                    day = 31 + 28 + 31 + 30 + date;
                    break;
                case "June":
                    day = 31 + 28 + 31 + 30 + 31 + date;
                    break;
                case "July":
                    day = 31 + 28 + 31 + 30 + 31 + 30 + date;
                    break;
                case "August":
                    day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + date;
                    break;
                case "September":
                    day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + date;
                    break;
                case "October":
                    day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date;
                    break;
                case "November":
                    day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date;
                    break;
                case "December":
                    day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date;
                    break;
                default:
                    System.out.println("Invalid input");
            }
            int dayNumber = day % 7;
            // since day 1 is Monday
            if (dayNumber == 0 || dayNumber == 6) {
                System.out.print("Hurray!");
            } else {
                System.out.print("Ohhh! It's a work day :|");
            }
            sc.close();
        }
        }

    }

