package datastructure;
import java.util.Scanner;  // Import the Scanner class
public class multiArrays {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int [][][]arr=new int[5][5][5];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int z=0;z<2;z++){
                    arr[i][j][z]=sc.nextInt();
                    System.out.println();
                }
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int z=0;z<2;z++){
                    System.out.print(arr[i][j][z]+"\t");
                }
            }
        }
    }
}
