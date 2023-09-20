
class student{
    int[] a = {12,13,14,15,11,5,6,7};
    String[] b = {"ram","shyam","shoaib"};
    void display(){
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]+" ,");
        }
    }
    void display2(){
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}

public class Array2 {
    public static void main(String[] args) {
        student obj = new student();
        obj.display();
    }
}
