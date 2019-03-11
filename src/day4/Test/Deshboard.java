package day4.Test;

public class Deshboard {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Azmi";
        person.semester = 4;
        person.balance = 50;

        Person person1 = new Person();
        person1.name = "Naymur";
        person1.semester = 4;
        person1.balance = 70;

        Person person2 = new Person();
        person2.name = " jubair";
        person2.semester = 7 ;
        person2.balance = 100;

        Person person3 = new Person ();
        person3.name = "Sabrina";
        person3.semester = 3 ;
        person3.balance = 50;

        int result;

        result = person.balance+person1.balance+person2.balance+person3.balance;

        System.out.println("They all have Total = "+result);



    }
}
