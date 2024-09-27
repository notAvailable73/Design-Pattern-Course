package payment;

public class digitalWallet implements IPaymentMethod{
    String phoneNum;
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
