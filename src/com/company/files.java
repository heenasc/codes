package com.company;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class files {
        public static void main(String[] args) throws FileNotFoundException {
            {
                System.out.println("We can read a file line-by-line as shown below-");
                File fileName = new File("/home/heena/Desktop/Untitled Document 1.txt");
                Scanner sc = new Scanner(fileName);
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
            }
            {
                System.out.println("We can read a file word-by-word as shown below-");
                File filename = new File("/home/heena/Desktop/Untitled Document 1.txt");
                Scanner scan = new Scanner(filename);
                while (scan.hasNext()) {
                    System.out.println(scan.next());
                }
            }
            {
                System.out.println("read the numbers and do sum of number");
                File filename =new File("/home/heena/Desktop/Untitled Document 2.txt");
                Scanner scanner =new Scanner(filename);
                int number=1;
                int sum=0;
                while(scanner.hasNext()){
                    number=scanner.nextInt();
                    sum=sum+number;
                }
                System.out.println("Sum is : " + sum);
            }
            {
                System.out.println("write anyhting you want in file");
                Scanner scan = new Scanner(System.in);
                try {

                    FileWriter writer = new FileWriter("/home/heena/Desktop/Untitled Document 1.txt"); // Specify the path of the file where you wish to store the output of this code
                    Boolean write = true;

                    System.out.print("Enter what you wish to write ");
                    String line = scan.nextLine(); // read the line

                    // write the input line to the file.
                    writer.write(line);
                    writer.close();

                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("Done");
            }
            {
                System.out.println("write prime numbers upto 1000");
                Scanner scan = new Scanner(System.in);
                try {

                    FileWriter writer = new FileWriter("/home/heena/Desktop/Untitled Document 1.txt"); // Specify the path of the file where you wish to write the output
                    writer.write("");
                    Boolean write = true;

                    for (int num = 2; num <= 1000; num++) {
                        boolean primecheck = true;
                        for (int i = 2; i <= Math.sqrt(num); i++) {
                            // condition for non-prime number
                            if (num % i == 0) {
                                primecheck = false;
                                break;
                            }
                        }

                        if (primecheck == true) {
                            writer.write(num + " "); // write this to the file.
                        }
                    }

                    writer.close();

                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("Done");
            }
            {
                System.out.println("write line by line in file");
                try {
                    FileWriter writer = new FileWriter("/home/heena/Desktop/Untitled Document 1.txt");
                    writer.write("This will be printed in My Output File.\n");
                    writer.write("This will be second line.\n");
                    writer.write("This will be third line, and so on.\n");
                    writer.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("Done");
            }
        }
}
