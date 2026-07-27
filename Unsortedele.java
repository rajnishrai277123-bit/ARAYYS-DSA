public class Unsortedele{
    //unsorted element in array
    static int element(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i+1]<=arr[i]){
              return  arr[i+1];

            }
          
        }
        return -1;

      
            
        }
       
       
    
    public static void main(){
        int arr[]={1,4,8,4,9};
        System.out.println(element(arr));
       
        


    }
}