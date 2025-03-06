import java.util.*;

public class WhileEx {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        int num=sc.nextInt();
       
        while(num<=10)
        {
            for(int i=1;i<=10;i++)
            {
                int result=(num*i);
                System.out.println(num + " x "+ i +" = "+result);
            }
            
            num++;
        }
      
        

    }
}
