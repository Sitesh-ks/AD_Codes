import java.util.Scanner;

public class Rotating_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of elements : ");
        int n = sc.nextInt();
        int number[] = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("Enter the k pos :");
        int k = sc.nextInt();
        for (int i = k; i < n; i++) {
            System.out.println(number[i]);
        }
        for (int i = 0; i < k; i++) {
            System.out.println(number[i]);
        }
    }

}
