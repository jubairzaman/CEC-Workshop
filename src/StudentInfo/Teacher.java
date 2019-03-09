package StudentInfo;

public class Teacher {
    String name ;
    String initial;
    int id;
    int phone;
    double rating;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", initial='" + initial + '\'' +
                ", id=" + id +
                ", phone=" + phone +
                ", rating=" + rating +
                '}';
    }
}
