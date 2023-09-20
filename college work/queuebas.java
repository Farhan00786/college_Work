import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class queuebas {
    public static void main(String[] args) {
      Queue<Integer> q1 = new PriorityQueue<>();
    // TreeSet<Integer> q1 = new TreeSet<>();  
      q1.add(1);
      q1.add(6);
      q1.add(2);
      q1.add(3);
      q1.add(4);
      q1.poll();
      System.out.println(q1);
      q1.clear();
      System.out.println(q1);
    }
}
