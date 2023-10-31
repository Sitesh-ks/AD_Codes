import java.util.Scanner;

public class Sum_Of_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int sign = 1;
        for (int i = 1; i <= n; i++) {
            sum += sign * i;
            sign = -sign;
        }

        System.out.println("Sum of the series: " + sum);
    }
}