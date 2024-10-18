package user;

public class user {
    private String mailAddress;
    private String phoneNum;
    private String name;

    public user(String name,String phoneNum,String mailAddress){
        this.name = name;
        this.phoneNum = phoneNum;
        this.mailAddress = mailAddress;
    }
    public String getMail(){
        return mailAddress;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public String getName(){
        return name;
    }

}
