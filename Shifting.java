public class Shifting{
    //shift array element by 1 position
    static void shift(int[] arr){
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

      
            
        }
       
       
    
    public static void main(){
        int arr[]={1,4,8,4,9};
        shift(arr);
        for(int a:arr){
            System.out.println(a +" ");

        }
        System.out.println();
       
        


    }
}