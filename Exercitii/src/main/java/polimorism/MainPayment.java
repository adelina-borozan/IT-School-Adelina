package polimorism;

public class MainPayment {

    public static void main(String args[]){
        Payment pay1 = new CreditCardPayment();
        Payment pay2 = new PaypalPayment();

        pay1.pay();
        pay2.pay();

        pay1 = new PaypalPayment();
        pay2 = new CreditCardPayment();

        pay1.pay();
        pay2.pay();

    }
}
