package payment;

public interface IPaymentMethod {
    void pay(double amount);
    double calculateFare();

}
