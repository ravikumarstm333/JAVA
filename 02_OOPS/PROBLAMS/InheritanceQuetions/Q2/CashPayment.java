class CashPayment extends Payment {
    @Override
    public void process(){
        System.out.println("Opening cash drawer...");
    }
}