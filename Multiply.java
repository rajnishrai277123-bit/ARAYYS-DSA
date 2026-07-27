public class Multiply{
    //Multiply each element of array by 10
    static int[] multiplyby10(int[] arr){
        int size=arr.length;
        int newArray[]=new int[size];
        for(int i=0;i<size;i++){
            int element=arr[i];
            int newElement=element * 10;
            newArray[i]=newElement;
        }
        return newArray;
        
        }
       
    
    public static void main(){
        int[] arr={2,3,4,5};
        int[] ans=multiplyby10(arr);
        System.out.println("printing array");
        for(int i:ans){
            System.out.println(i);
        }


    }
}