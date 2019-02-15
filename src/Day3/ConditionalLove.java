package Day3;
import java.util.Scanner;
public class ConditionalLove {
    //main method
    public static void main (String[]arg){
        //scanner to take input
        Scanner Dontuse = new Scanner (System.in);
        //initialation
        String name;
        int age;
        int sex;
        String feelings;


        System.out.println("Whats Your Name");
        name= Dontuse.nextLine();
        System.out.println("How are you "+name);
        feelings= Dontuse.nextLine();
        if (feelings.equalsIgnoreCase("Fine")){
            System.out.println("Thats great,Are you male or female ?");
            sex=Dontuse.nextInt();
            if (sex==1){
                System.out.println("Hey my boy");
            } else if (sex==0){
                System.out.println("Hey babe");
            } else{
                System.out.println("Hey rainbow");

            }
        }

        System.out.println("Whats your Age ");
        age=Dontuse.nextInt();

        switch (age) {
            case 1:
                System.out.println("h");
                break;
            case 2:
                System.out.println("i");
                break;
            case 3:
                System.out.println("j");
                break;
            case 4:
                System.out.println("k");
                break;
            case 5:
                System.out.println("l");
                break;
            case 6:
                System.out.println("m");
                break;
            case 7:
                System.out.println("n");
                break;
            case 8:
                System.out.println("o");
                break;
            case 9:
                System.out.println("p");
                break;
            case 10:
                System.out.println("q");
                break;
            case 11:
                System.out.println("r");
                break;
            case 12:
                System.out.println("s");
                break;
            case 13:
                System.out.println("t");
                break;
            case 14:
                System.out.println("u");
                break;
            case 15:
                System.out.println("v");
                break;
                default:
                    System.out.println("Sorry You cant use it");

        }

        //switching off the Scanner
        Dontuse.close();



    }
}
