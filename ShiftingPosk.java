public class ShiftingPosk {
    //shifting array element by k postion

    static void shift(int[] arr, int k) {
        int temp = arr[k];

        for (int i = k; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 8, 4, 9};

        shift(arr, 3);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}