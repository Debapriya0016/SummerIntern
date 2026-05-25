public class NeonNumber {

    
    public static void checkNeon(int number) {

        int square = number * number;
        int sum = 0;

    
        while (square != 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        
        if (sum == number) {
            System.out.println(number + " is a Neon Number");
        } else {
            System.out.println(number + " is not a Neon Number");
        }
    }


    public static void main(String[] args) {

        checkNeon(9);
        checkNeon(10);
    }
} 
    
