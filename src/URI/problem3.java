package URI;
import java.util.Scanner;

public class problem3 {
    public static void main (String[] arg){

        Scanner vivo = new Scanner(System.in);

        int A ;
        int B ;
        int x ;

        A = vivo.nextInt();
        B = vivo.nextInt();

        x = A + B;

        System.out.println("SOMA = "+x);

        vivo.close();

    }

}
