package thirdParty;
import user.user;
public class epostalMailSender {
    public void sendEpostalMail(int code, user _user ,String msg){
        System.out.println("Sent notification through e-postal Mail. Sent to " + _user.getName() +". Code: " + code);
    }
}
