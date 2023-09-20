import java.util.ArrayList;

public class Std {
    
    public static void main(String[] args) {
        ArrayList<data> s1 = new ArrayList<>();
        ArrayList<data> s2 = new ArrayList<>();
        data s11 = new data("farhan",12,"rcet");
        data s12 = new data("awdaw", 13, "rcet");
        s1.add(s11);
        s2.add(s12);
        s1.addAll( s2);
        System.out.println(s1.get(1).name);
        System.out.println(s1.get(1).roll_no);
        System.out.println(s1.get(1).college);
}
}
class data{
    String name;
    int roll_no;
    String college;
    
    public data(String name, int roll_no, String college) {
        this.name = name;
        this.roll_no = roll_no;
        this.college = college;
    }
}
