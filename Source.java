import java.util.Scanner;

public class Source {
  public static void main(String args[] ) throws Exception {
    int no;
    String name;
    float value;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter int");
    no=sc.nextInt();
    System.out.println(no);
    Scanner sc1=new Scanner(System.in);
    System.out.println("enter string");
    name=sc1.nextLine();
    Scanner sc2=new Scanner(System.in);
    System.out.println("enter float");
    value=sc2.nextFloat();
    System.out.println(no);
    System.out.println(name);
    System.out.println(value);
    }
  }
