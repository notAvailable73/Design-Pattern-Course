package userRoles;

public class Driver extends User{
    String vehicleType;
    String location;
    boolean isAvailable;

    public Driver(String id, String name){
        super(id,name);
        isAvailable= true;
    }

    public void acceptRide(){
        System.out.println("Ride Accepted");
    }
    public void cancelRide(){
        System.out.println("Ride Cancelled");
    }

    public void rateRider(){
        System.out.println("Rider rated");

    }

}
