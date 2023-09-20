import java.util.*;
public class solutionThree {
    static double sum(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number:");
        double a = sc.nextDouble();

        System.out.println("enter the second number:");
        double b = sc.nextDouble();

        double sum = a+b;
        System.out.println("the sum of the number is "+ sum);
    }
}
