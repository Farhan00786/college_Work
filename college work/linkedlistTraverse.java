import java.util.*;
public class linkedlistTraverse {
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

    public void traversal(){
    node temp = new node(5);
    temp =this.head;
    if(temp != null) {
      System.out.print("The list contains: ");
      while(temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    } else {
      System.out.println("The list is empty.");
    }
    }
    public static void main(String[] args) {
        linkedlistTraverse obj = new linkedlistTraverse();
        obj.insert();
        obj.traversal();
    }
}
/*
 * collection = list , map , set , stack , queue.
 */