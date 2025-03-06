import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            numbers[i] = sc.nextInt();
        }
        int sum = 0;
        for(int j = 0; j<n; j++){
            sum = sum +numbers[j];
        }
        System.out.println(sum);
    }
}
    