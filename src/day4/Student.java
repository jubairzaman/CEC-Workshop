package day4;

public class Student {

    String Name;
    int Id;
    String Location;
    int Semester;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Id=" + Id +
                ", Location='" + Location + '\'' +
                ", Semester=" + Semester +
                '}';
    }
}
