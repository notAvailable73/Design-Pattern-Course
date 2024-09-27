package userRoles;

public abstract class User {
    String id;
    String name;
    double rating;
    public User(String id, String name){
        this.id = id;
        this.name = name;
    }
    public  void setRating(double rating){
        this.rating = rating;
    }


}
