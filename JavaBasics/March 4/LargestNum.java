public class LargestNum {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 56, 89, 12, 90, 7};
        int max = numbers[0]; 

        for (int i = 1; i < numbers.length; i++) { 
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
        }

        System.out.println("Largest element in the array: " + max);
    }
}
