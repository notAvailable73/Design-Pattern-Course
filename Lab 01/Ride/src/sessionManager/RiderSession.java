package sessionManager;

public class RiderSession {
    public void login(){
        System.out.println("Welcome!\nEnter username");
        String username = System.console().readLine();
        System.out.println("Enter Password");
        String password = System.console().readLine();


        if(username.equals("rider") && password.equals("rider")){
            System.out.println("LOgged in as rider");
        }
        else{
            System.out.println("Login failed");
        }
    }



    public void printMenu(){
        System.out.println("1. Book Ride");
        System.out.println("2. End Ride");
        System.out.println("3. Log out");
    }
}