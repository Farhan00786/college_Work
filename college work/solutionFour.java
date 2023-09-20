import java.util.Scanner;

public class solutionFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , j, n , count;
        System.out.println("enter the number fron which you want to display prime no. ");
        n = sc.nextInt();
        System.out.println("the prime number upto "+n+" is: ");
        for(i=2;i<=n;i++){
            count = 0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }
}
