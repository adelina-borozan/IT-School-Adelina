package polimorism;

public class PaypalPayment extends Payment {

    @Override
    public void pay(){
        System.out.println("Paypal Tranzactie in desfasurare...");
    }
}
