public class main {
    public static void main(String[] args) {
        PaymentGateway pg=new PaymentGateway();
        CreditCardPayment cp=new CreditCardPayment();
        CashPayment casp=new CashPayment();
        pg.executePayment(cp);
        pg.executePayment(casp);
    } 
}
