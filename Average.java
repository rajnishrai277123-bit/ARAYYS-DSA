public class Average{
    //find average of arrays element
    static double getAverage(int[] arr){
        int sum=0;
        for(int i:arr){
            sum +=i;
        }
        int size=arr.length;
        double avg=sum/size;
        return avg;
    }
    public static void main(){
        int[] arr={2,3,4,5};
        System.out.println(getAverage(arr));


    }
}