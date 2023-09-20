public class exception{
    static void divide(int a,int b){
        int result;
        try{
            result =a/b;
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        int a = 55;
        int b = 0;
        divide(a, b);
        
    }
}