class codeTHree{
    public static void main(String[] args) {
        int a =25;
        int b = 16;
        int c =81;
        int d = 13;
        if(a>b && a>c && a>d){
            System.out.println("a is greater");
        }
        else if(b>c && b>d){
            System.out.println("b is greater");
        }
        else if(c>d){
            System.out.println("c is greater");
        }
        else{
            System.out.println("d is greater");
        }
        
    }
}