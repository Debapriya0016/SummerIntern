public class ReverseNumber {

    public static void reverseNumber(int number) {
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed Number = " + reverse);
    }

    public static void main(String[] args) {
        reverseNumber(12345);
    }
} 