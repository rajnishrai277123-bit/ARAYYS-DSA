public class BinaryLowerBound{
    static int LowerBound(int arr[],int target){
        int n=arr.length;
       int s=0;
       int e=n-1;
       int ans=-1;
       while(s<=e){
        int mid=s+(e-s)/2;
        if(arr[mid]>=target){
            ans=mid;
            e=mid-1;
        }
        else{
            s=mid+1;
        }
       }
       return ans;

    }
    public static void main(){
        int arr[]={6,1,5,6,9,0};
        int target=7;
      int ans=  LowerBound(arr,target);
        System.out.println("printing the array" +" "+ans);
      

    }
}