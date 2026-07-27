public class Searching{
    //find target in array
    static boolean searching(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return true;
            }
            
        }
        return false;

        
        
        }
       
    
    public static void main(){
        int[] arr={2,3,4,5};
       boolean ans= searching(arr,4);
       System.out.println(ans);

        


    }
}