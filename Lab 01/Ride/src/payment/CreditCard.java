package payment;

public class CreditCard implements IPaymentMethod{

    String cardNum;
    String date;
    String cvv;

    double fare;


    @Override
    public void pay(double amount) {
        System.out.println("Paid Successfully");
    }

    @Override
    public double calculateFare() {
        return fare;
    }
}
