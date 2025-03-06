import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = sc.nextLine();
        if(isPalindrome(input))
        {
            System.out.println("The given String is a Palindrome");
        }
        else{
            System.out.println("The given String is not a palindrome");
        }
    }
    
    static boolean isPalindrome(String str)
    {
        str = str.replaceAll("\\s+", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }

   

    
}
