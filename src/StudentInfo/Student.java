package StudentInfo;

public class Student {

    String Name;
    int Id;
    String Location;
    int Semester;

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
