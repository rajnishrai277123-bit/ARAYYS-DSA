public class Selection{
    static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                  minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }

    }
    public static void main(){
        int arr[]={6,1,6,9,0};
        selectionsort(arr);
        System.out.println("printing the array");
        for(int value:arr){ 
            System.out.println("printing" +" " +value);
        }

    }
}