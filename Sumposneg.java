public class Sumposneg{
    //Sum postive and negative in given array
    static int[] Sumiing(int[] arr){
        int n=arr.length;
        int pos=0;
        int neg=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos=pos+arr[i];
            }
            else{
                neg=neg+arr[i];
            }
            
        }
        int ans[]={pos,neg};
        return ans;

        
        
        }
       
    
    public static void main(){
        int[] arr={2,-3,4,-5};
      int ans[]=Sumiing(arr);
      System.out.println(ans[0]);
      System.out.println(ans[1]);
        


    }
}