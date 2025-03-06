import java.util.*;

public class AtmPin{
    public static void main(String[] args) {
        final int correct_pin = 5171;
        int attempts=3;
        Scanner sc = new Scanner(System.in);

        while(attempts>0)
        {
            System.out.println("Enter Your ATM PIN: ");
            int pin_entered = sc.nextInt();
            if(pin_entered == correct_pin)
            {
                System.out.println("Access Granted!!");
                break;
            }
            else
            {
                attempts--;
                if(attempts>0)
                {
                    System.out.println("Incorrect PIN. You have "+ attempts +" attempts left.");
                }
                else
                {
                    System.out.println("Incorrect PIN. Reached maximum number of attempts, Try after 24 Hours..!");
                }

            }


        }
    }
}