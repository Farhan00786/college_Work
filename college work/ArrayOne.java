public class ArrayOne {
    public static void main(String[] args) {
        int[] arr = {10,20,5,4,15,45,84,12,17,16,13};
        int max,sec_max,i,third_max;
        max=0;
        sec_max=0;
        third_max=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(i=0;i<arr.length;i++){
            
            if(arr[i]>sec_max && arr[i]<max){
                sec_max = arr[i];
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]>third_max && arr[i]<sec_max){
                third_max = arr[i];
            }
        }
        System.out.println("Max value is "+max);
        System.out.println("second max is "+sec_max);
        System.out.println("third max is "+third_max);
    }
}
