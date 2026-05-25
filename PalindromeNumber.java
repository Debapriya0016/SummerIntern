public class PalindromeNumber {

    
    public static void checkPalindrome(int number) {

        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;          
            reverse = reverse * 10 + digit;
            number = number / 10;             
        }

        
        if (original == reverse) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is not a Palindrome Number");
        }
    }


    public static void main(String[] args) {

        checkPalindrome(121);
        checkPalindrome(123);
    }
} 
    

