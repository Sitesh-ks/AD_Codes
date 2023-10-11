import java.util.*;

public class SumOf_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; ++i) {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}