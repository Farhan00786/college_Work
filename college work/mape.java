// import java.util.ArrayList;
import java.util.*;
// import java.util.HashMap;
// import java.util.Iterator;
// import java.util.Map;
// import java.util.Set;

public class mape {
    public static void main(String[] args) {
        Map<String,Integer> m1 = new HashMap<>();
         m1.put("a", 2);
         m1.put("b", 3);
         m1.put("c", 4);
         System.out.println(m1);
        //  Iterator<Map.Entry<String,Integer>> itr = m1.entrySet().iterator();
        //  Set m2 = m1.entrySet();
        // Iterator itr = m2.iterator();
        // while(itr.hasNext()){
        //     Map.Entry<String,Integer> entry = itr.hasNext();
        //     System.out.println(entry.getKey()+entry.getValue());
        // }
         for (Integer roll : m1.values()) {
            System.out.println("key "+roll);
         }
         for (String name : m1.keySet()) {
            System.out.println("name "+name);
         }
    }
}
