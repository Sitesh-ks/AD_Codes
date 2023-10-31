public class No_Of_Digits {

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 12345;
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
    }
}
