package StudentInfo;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner vivo = new Scanner(System.in);

        String name;
        int Nsu_Id;
        String location;
        int semester;

        //input from user
        name = vivo.next();
        Nsu_Id = vivo.nextInt();
        location = vivo.next();
        semester = vivo.nextInt();

        //Presentation

        System.out.println("Name :"+name);
        System.out.println("NSU ID :"+Nsu_Id);
        System.out.println("Location :"+location);
        System.out.println("Semester :"+semester);
    }
}
