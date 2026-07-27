public class ArrayReverse{
    //unsorted element in array
    static void reverse(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k:arr){
            System.out.println(k);
        }

      
            
        }
       
       
    
    public static void main(){
        int arr[]={1,4,8,4,9};
        reverse(arr);
       
        


    }
}