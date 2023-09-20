import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        System.out.println("enter the age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String res = age>18 ? "you are eligible" : "you are not eligible.";
        System.out.println(res);
    }
}
