interface UPIPayment
{
   void UpiTransfer();
}
interface CreditCardPayment
{
    void CardTransfer();

}

class PaymentGateway implements UPIPayment, CreditCardPayment
{
   public void UpiTransfer()
    {
        System.out.println("UPI Payment Successful");
    }

    public void CardTransfer()
    {
        System.out.println("Credit Card Payment Successful");
    }

}

public class InterfaceEx
{
    public static void main(String[] args) 
    {
        PaymentGateway obj1 = new PaymentGateway();
        obj1.UpiTransfer();
        obj1.CardTransfer();
    }
}