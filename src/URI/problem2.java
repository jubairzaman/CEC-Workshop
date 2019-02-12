package URI;
import java.util.Scanner;



public class problem2 {

    public static void main (String [] arg) {
        Scanner vivo = new Scanner(System.in);
        double A ;
        double n = 3.14159;
        double R;


        R = vivo.nextDouble();
        double square = Math.pow(R, 2);
        A = n*R;

        System.out.println("A = "+A);

    }

}

