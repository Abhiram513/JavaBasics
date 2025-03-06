import java.util.*;
public class SumofDigits
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        System.out.println("Sum of Digits: "+ SumDigits(num));
        
    }
    
    static int SumDigits(int n)
    {
        if(n==0)
        {
            return n;
        }
        return (n%10)+SumDigits(n/10);
    }

   
}