

public class OddElements {
    public static void main(String[] args) {
        int[]  arr ={10,15,20,25,30};
        System.out.println("Odd elements are in array");
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }    
        


    }
    
}
