import java.util.ArrayList;

public class arrCompare {

    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("farhan");
        arr1.add("shoaib");
        arr1.add("safdar");
        System.out.println(arr1);
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("farhan");
        arr2.add("anuj");
        arr2.add("kunal");
        System.out.println(arr2);
        int i=0;
        boolean bn;
        while(arr1.size()>i){
            bn=arr1.get(i)==arr2.get(i)?true:false;
            if(bn==true){
                System.out.print(arr1.get(i)+" ");
            }
            else{
                System.out.print(false+" ");
            }
            i++;
        }
    }
}