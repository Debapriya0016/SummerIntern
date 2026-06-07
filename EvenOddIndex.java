public class EvenOddIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("Sum of even index values = " + evenSum);
        System.out.println("Sum of odd index values = " + oddSum);
    }
} 
    

