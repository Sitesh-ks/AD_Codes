
import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        System.out.println("Decimal equivalent: " + decimal);
    }
}
