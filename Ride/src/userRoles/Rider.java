package userRoles;

public class Rider extends User{

    public Rider(String id, String name) {
        super(id, name);
    }

    public void rateDriver(){
        System.out.println("Driver rated!");
    }

    public void requestRide(){
        System.out.println("Ride requested");
    }

    public  void makePayment(){
        System.out.println("Paid Successfully");
    }
}
