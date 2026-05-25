public class SumOfDigits {

    
    public static void findSum(int number) {

        int sum = 0;

        while (number != 0) {
            int digit = number % 10; 
            sum = sum + digit;       
            number = number / 10;    
        }

        System.out.println("Sum of digits = " + sum);
    }

    
    public static void main(String[] args) {

        findSum(1234);
    }
}