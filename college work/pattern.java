public class pattern{
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4};
        int i , j ,temp;
        temp=0;
         i =0;
        j = arr.length-1;
        while(i!=j && i<j){
            temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
    } 
}