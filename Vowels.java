public class Vowels {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'e', 'k', 'i', 'm', 'o', 'p', 'u'};

        System.out.println("Vowels present in the array are:");

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {

                System.out.println(ch);
            }
        }
    }
} 


