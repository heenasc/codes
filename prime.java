import java.util.Scanner;
class prime{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
count=0
for(int i=2;i<=num;i++){
for(int j=2;j<=i;j++){
if(i%j==0)
{
break;
}
if(i==j){
System.out.println("prime number are "+j);
}
}
}
}
}
