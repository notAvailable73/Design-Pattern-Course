package sessionManager;

public class AdminSession {
    public void login(){
        System.out.println("Welcome!\nEnter username");
        String username = System.console().readLine();
        System.out.println("Enter Password");
        String password = System.console().readLine();


        if(username.equals("admin") && password.equals("admin")){
            System.out.println("LOgged in as Admin");
        }
        else{
            System.out.println("Login failed");
        }
    }



    public void printMenu(){
        System.out.println("1. View Rides");
        System.out.println("2. View Drivers");
        System.out.println("3. Log out");
    }
}
