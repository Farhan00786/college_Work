import java.util.Stack;

public class Stacked {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(11);
        s1.push(12);
        s1.push(19);
        s1.push(15);
        s1.push(16);
        System.out.println(s1);
        s1.pop();
        s1.peek();
        s1.empty();
        System.out.println(s1);
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
}
