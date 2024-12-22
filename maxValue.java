public class maxValue {
    public static int searchMax(int[] arr, int n){
        if (n == 1){
            return arr[0];

        }

        int x = searchMax(arr, n - 1);

        return Math.max(x, arr[n - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {24,70,90,111,112,50,20};
        int n = arr.length;

        int max = searchMax(arr, n);
        System.out.println("Nilai maksimum array: " + max);
    }
}
