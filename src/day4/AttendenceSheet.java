package day4;

public class AttendenceSheet {
    public static void main(String[] args) {
        Teacher dalim = new Teacher ();
        dalim.id = 12345678;
        dalim.name = "Zonayed";
        dalim.initial = "ZBZ";
        dalim.rating = 2.5;
        dalim.phone = 123456789;

        System.out.println(dalim.toString());


    }
}
