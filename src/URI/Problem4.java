package URI;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[]arg){

        Scanner vivo = new Scanner(System.in);
        int A;
        int B;
        int PROD;

        A=vivo.nextInt();
        B=vivo.nextInt();
        PROD= A*B;

        System.out.println("PROD = "+PROD);
        vivo.close();


    }
}
