public class ArmstrongNumber {

    
    public static void checkArmstrong(int number) {

        int original = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }

        
        if (original == sum) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }
    }

    
    public static void main(String[] args) {

        checkArmstrong(153);
        checkArmstrong(123);
    }
} 
    

