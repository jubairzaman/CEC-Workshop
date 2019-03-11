package day3;
import java.util.Scanner;
public class ExtrimAddition {
    //main method
    public static void main(String[] args) {
        // Scanner for taking input
        Scanner vivo=new Scanner (System.in);

        int num[] = new int[20];
        num[20]= 0;

        for(int i = 0 ; i<=9 ;i ++){
            num[i]=vivo.nextInt();
            num[10]=num[10]+num[i];

        }
        System.out.println("Sum = "+ num[10]);
        vivo.close();



    }
}
