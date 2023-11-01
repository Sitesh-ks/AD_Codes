import java.util.Scanner;

public class Sum_Of_Primes {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean canBeRepresentedAsSumOfPrimes(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (canBeRepresentedAsSumOfPrimes(num)) {
            System.out.println(num + " can be represented as the sum of two prime numbers.");
        } else {
            System.out.println(num + " cannot be represented as the sum of two prime numbers.");
        }
    }
}