import java.util.ArrayList;

public class ArraylistQue {

    public static void main(String[] args) {
        ArrayList<String> find = new ArrayList<>();
        find.add("abcde");
        find.add("farhan");
        find.add("shoaib");
        find.add("eram");
        for (String arrl : find) {
            // System.out.println(arrl);
            // for(int i = 0;i<arrl.length();i++){
                if(arrl.contains("e")){
                    System.out.println(arrl);
                }
            // }
            
        }
    }
}