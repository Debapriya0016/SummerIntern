
public class SpyNumber {

    
    public static void checkSpy(int number) {

        int sum = 0;
        int product = 1;
        int original = number;

        
        while (number != 0) {
            int digit = number % 10;

            sum = sum + digit;
            product = product * digit;

            number = number / 10;
        }

        
        if (sum == product) {
            System.out.println(original + " is a Spy Number");
        } else {
            System.out.println(original + " is not a Spy Number");
        }
    }

    
    public static void main(String[] args) {

        checkSpy(1124);
        checkSpy(123);
    }
} 
    

