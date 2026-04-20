package polimorism;

public class CreditCardPayment extends Payment {

    @Override
    public void pay(){
        System.out.println("CredCard Tranzactie in desfasurare...");
    }
}
