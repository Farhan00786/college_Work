import java.util.Scanner;

public class StackArray {
    public static int top ;
    public static void push(int arr[]){
        int n = arr.length;
        if(top==(n-1)){
            System.out.println("stack overflow");
        }
        else{
            int i;
            System.out.println("enter the number ");
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
            arr[top] = i;
            top++;
        }
    }
    public static int pop(int arr[]){
        int n = arr.length;
        if(top==-1){
            System.out.println("stack underflow ");
            return 0;
        }
        else{
            int i = arr[top];
            top--;
            return i;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        push(arr);
        push(arr);
        push(arr);
        push(arr);
        push(arr);
        push(arr);
        System.out.println(pop(arr));
        System.out.println(pop(arr));
        System.out.println(pop(arr));
        System.out.println(pop(arr));
        System.out.println(pop(arr));
        System.out.println(pop(arr));
    }
}
