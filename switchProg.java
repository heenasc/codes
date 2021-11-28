import java.util.Scanner;
class switchProg
{
public static void main(String args[] ){
Scanner sc=new Scanner(System.in);
int month =sc.nextInt();
int DaysInMonth = 0;
int year=1;
    switch (month) {
            case 1:
                DaysInMonth = 31;
                System.out.println(DaysInMonth);
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    DaysInMonth = 29;
                    System.out.println(DaysInMonth);
                } else {
                    DaysInMonth = 28;
                    System.out.println(DaysInMonth);
                }
                break;
            case 3:
                DaysInMonth = 31;
                System.out.println(DaysInMonth);
                break;
            case 4:
                DaysInMonth = 30;
                System.out.println(DaysInMonth);
                break;
            case 5:
                DaysInMonth = 31;
                System.out.println(DaysInMonth);
                break;
            case 6:
                DaysInMonth = 30;
                System.out.println(DaysInMonth);
                break;
            case 7:
                DaysInMonth = 31;
                System.out.println(DaysInMonth);
                break;
            case 8:
                DaysInMonth = 31;
                System.out.println(DaysInMonth);
                break;
            case 9:
                DaysInMonth = 30;
                System.out.println(DaysInMonth);
                break;
            case 10:
                DaysInMonth = 31;
                System.out.println(DaysInMonth);
                break;
            case 11:
                DaysInMonth = 30;
                System.out.println(DaysInMonth);
                break;
            case 12:
                DaysInMonth = 31;
                System.out.println(DaysInMonth);
                break;
            default:
                System.out.println("invalid input");
                break;
            
        }

     

}
}
//when i used nextLine it shows me error and when i use next only its run properly.
//they accept solution which they already put in solution they didnt accept if true in another way
