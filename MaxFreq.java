import java.util.HashMap;

public class MaxFreq {

    static int frequency(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxfreq = -1;
        int maxfreqkey = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyFreq = freq.get(key);

            if (currentKeyFreq > maxfreq) {
                maxfreq = currentKeyFreq;
                maxfreqkey = currentKey;
            }
        }

        return maxfreqkey;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 8, 4, 9};
        System.out.println("Answer is ready")

        System.out.println(frequency(arr));
    }
}