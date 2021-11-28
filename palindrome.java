import java.util.Scanner;
class palindrome{
public static void main(String args[]){
int num=122,rev=0,rem,i;
i=num;
while(num>0){
rem=num%10;
rev=rev*10+rem;
num/=10;
}
if(i==rev)
System.out.println("palindrome");

else
System.out.println("palindrome");

}
}

