import java.util.*;

public class vehicle {
    public static void main(String[] args) {
        Map<String,Integer> vehicles = new HashMap<>();
        vehicles.put("BMW", 10);
        vehicles.put("AUDI", 12);
        vehicles.put("Lamborghini",15 );
        for (String key : vehicles.keySet()) {
            System.out.println(key+" - "+vehicles.get(key));
            System.out.println();
        }
        //clear all values
        String searchkey = "AUDI";
        if(vehicles.containsKey(searchkey)){
            System.out.println("Found Total "+vehicles.get(searchkey));
        }
        //equal to zero
        vehicles.clear();
        System.out.println("after clear operation size: "+vehicles.get(searchkey));
    }
}
