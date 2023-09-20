import java.util.ArrayList;

public class studentdata {
    String Student_name;
    int Roll_no;
    public studentdata(String student_name, int roll_no, String collegename) {
        this.Student_name = student_name;
        this.Roll_no = roll_no;
        this.collegename = collegename;
    }
    String collegename;
    public static void main(String[] args) {
        ArrayList<studentdata> std = new ArrayList<>();
    }
}
