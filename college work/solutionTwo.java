import java.util.*;
public class solutionTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the principle:");
        double principle = input.nextDouble();

        System.out.println("enter the rate of intrest:");
        double rate = input.nextDouble();

        System.out.println("enter the time");
        double time = input.nextDouble();

        double interest = (principle*rate*time)/100;
        System.out.println("the simple interest is "+ interest);
    }
}
