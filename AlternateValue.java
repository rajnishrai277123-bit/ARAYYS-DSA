public class AlternateValue {
    //shifting array element by k postion

    static void alter(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i==j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }
            else{
                System.out.println(arr[i]);
                i++;
                 System.out.println(arr[j]);
                 j--;

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 8, 4, 9};

        alter(arr);

    }
}