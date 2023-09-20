import java.util.*;
public class linkedList {
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public node head = null;
    int a , n ;
    public void insert(){
        int a, n;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number ");
        do{
            System.out.println("enter the data");
            a = sc.nextInt();
            System.out.println("press 1 to terminate or else ignore ");
            n = sc.nextInt();
        }while(n!=1);
    }
    // if(head==null){
    //     head = n();
    // }
    // else{
    //     n.next = head;
    //     n=head;
    // }
    public void display(){

    }
    public static void main(String[] args) {
        linkedList obj = new linkedList();
        obj.insert();
    }
}
