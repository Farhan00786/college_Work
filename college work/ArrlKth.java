import java.util.ArrayList;
import java.util.Collections;

public class ArrlKth {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(5);
        num.add(8);
        num.add(2);
        int k =3;
        Collections.sort(num);
        System.out.println(num.get(num.size()-k));
        
    }
}
