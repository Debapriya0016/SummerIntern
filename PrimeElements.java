 public class PrimeElements {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 11, 15, 17};

        System.out.println("Prime numbers in the array are:");

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;

            if (num > 1) {
                for (int j = 1; j <= num; j++) {
                    if (num % j == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    System.out.println(num);
                }
            }
        }
    }
} 
    

