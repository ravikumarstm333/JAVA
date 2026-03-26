public class CreditCardPayment extends Payment{
    @Override
    public void process(){
        System.out.println("Validating CVV...");
    }
    
}