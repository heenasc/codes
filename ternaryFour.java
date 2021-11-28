import java.util.Scanner;
class ternaryFour{
public static void main(String args[] ){
int m1=10,m2=20,m3=30,m4=40;
int lar=0;
lar = (m1 > m2 && m1 > m3 && m1 > m4) ?
               m1 : ((m2 > m3 && m2 > m4) ?
               m2 : (m3 > m4 ? m3 : m4));
               System.out.println(lar);
               }
               }
