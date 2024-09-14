using System;

namespace RideSharingConsoleApp___Design_Patterns_Lab_01
{
    public enum payment_methods
    {
        paypal,
        CreditCard,
        DigitalWallet
    }
    public class paymentMethod
    {
        public void processPayment(payment_methods pMethod)
        {
            switch (pMethod)
            {
                case payment_methods.paypal:
                    Console.WriteLine("Payment Successfully Processed using Paypal");
                    break;
                case payment_methods.CreditCard:
                    Console.WriteLine("Payment Successfully Processed using Credit Card");
                    break;
                case payment_methods.DigitalWallet:
                    Console.WriteLine("Payment Successfully Processed using Digital Wallet");
                    break;
                default:
                    Console.WriteLine("Payment method not found");
                    break;
            }
        }
    }
}
