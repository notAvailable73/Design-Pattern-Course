package payment;

public class Paypal implements IPaymentMethod{

    String email;
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
