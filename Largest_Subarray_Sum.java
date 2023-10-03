import java.util.*;

public class Largest_Subarray_Sum {
    public static void main(String[] args) {
        int maximum_sum = 0;
        int current_sum = 0;
        int[] a = { 1, 2, 3, 4, 5, -5, -1, 2, -2 };
        for (int i = 0; i < a.length; i++) {
            current_sum = current_sum + a[i];
            if (current_sum > maximum_sum) {
                maximum_sum = current_sum;
            }
            if (current_sum < 0) {
                current_sum = 0;
            }
        }
        System.out.println(maximum_sum);
    }
}
