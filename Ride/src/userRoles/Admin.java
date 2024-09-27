package userRoles;

public class Admin extends User{
    public Admin(String id, String name) {
        super(id, name);
    }

    public void manageDriver(){
        System.out.println("Managing Driver");
    }
    public void manageRider(){
        System.out.println("Managing Rider");
    }

}
