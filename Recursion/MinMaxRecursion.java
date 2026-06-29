public class MinMaxRecursion {

    static void minMax(int[] arr, int index, int min, int max) {

        if (index == arr.length) {
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            return;
        }

        if (arr[index] < min) {
            min = arr[index];
        }

        if (arr[index] > max) {
            max = arr[index];
        }

        minMax(arr, index + 1, min, max);
    }

    public static void main(String[] args) {

        int[] arr = {30, 5, 80, 12, 45, 2, 90};

        minMax(arr, 0, arr[0], arr[0]);
    }
}