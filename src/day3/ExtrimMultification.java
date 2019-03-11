package day3;
import java.util.Scanner;

public class ExtrimMultification {

    public static void main(String[] args) {

        Scanner vivo = new Scanner(System.in);

        int num[]= new int[21];
        num[20]=0;

        for(int i = 1 ; i <= 19 ;i++) {
            num[i] = vivo.nextInt();
            num[20] = num[20] * num[i];


        }
        System.out.println(num[20]);
        vivo.close();

    }
}
