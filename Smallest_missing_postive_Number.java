import java.util.Arrays;

class Smallest_missing_positive_Number {

    // Function for finding the first
    // missing positive number
    static int firstMissingPositive(int arr[], int n) {

        // Check if 1 is present in array or not
        for (int i = 0; i < n; i++) {

            // Loop to check boundary
            // condition and for swapping
            while (arr[i] >= 1 && arr[i] <= n
                    && arr[i] != arr[arr[i] - 1]) {

                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Finding which index has value less than n
        for (int i = 0; i < n; i++)
            if (arr[i] != i + 1)
                return (i + 1);

        // If array has values from 1 to n
        return (n + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 0, 10, 2, -10, -20 };
        int n = arr.length;
        int ans = firstMissingPositive(arr, n);

        System.out.println(ans);
    }
}
