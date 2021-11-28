package com.company;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Exceptions {
    public static void main(String[] args) {
        {
            //int data = 67/0;
            //System.out.println("rest of the code goes here");
            try {
                int data = 67 / 0;
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("Rest of the code is here");
        }
        {
            int x = 60;
            int y = 0;
            try {
                int z = x / y;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        {
            try {
                //creating File instance to reference text file in Java
                File inputfile = new File("/home/heena/Desktop/Untitled Document 1.txt"); // Mention the path to the file here

                Scanner scan = new Scanner(inputfile);

                while (scan.hasNextLine() == true) {

                    String line = scan.nextLine();
                    System.out.println(line);
                }

                scan.close();

            } catch (Exception e) {
                System.out.print("File not found");
            }
        }

    }


}
