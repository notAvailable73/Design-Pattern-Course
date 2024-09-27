package sessionManager;

public class DriverSession {
    public void login(){
        System.out.println("Welcome!\nEnter username");
        String username = System.console().readLine();
        System.out.println("Enter Password");
        String password = System.console().readLine();


        if(username.equals("driver") && password.equals("driver")){
            System.out.println("LOgged in as driver");
        }
        else{
            System.out.println("Login failed");
        }
    }



    public void printMenu(){
        System.out.println("1. Start ride");
        System.out.println("2. End Ride");
        System.out.println("3. Log out");
    }
}
