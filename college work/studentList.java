import java.util.ArrayList;
import java.util.Collections;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class studentList {
    public static void main(String[] args) {
        ArrayList<String>studentList = new ArrayList<>();
        studentList.add("farhan");
        studentList.add("asad");
        studentList.add("daa");
        System.out.println(studentList);
        // Iterator<String> itr = studentList.iterator();
        studentList.set(1, "aaa");
        Collections.sort(studentList);
        
        for (String Student : studentList) {
            System.out.println(Student);
        }
    }
}
