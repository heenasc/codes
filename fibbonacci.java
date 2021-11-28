import java.util.Scanner;
class fibbonacci{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int next,f=0,s=1;
for(int i=0;i<=num;i++)
{
	System.out.println("fibonnaci is "+f);
	next=f+s;
	f=s;
	s=next;
		//System.out.println("fibonnaci is "+f);
}
}
}
