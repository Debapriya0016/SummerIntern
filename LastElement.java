public class LastElement {
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5,6};
        if (numbers.length>=2) {
            int secondLast=numbers[numbers.length-2];
            System.out.println(secondLast);
            
        }else{
            System.out.println("Array is too short.");
        }
    }
    
}
