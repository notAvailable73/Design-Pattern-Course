import notificationSystems.emailSender;
import notificationSystems.epostalMailAdapter;
import notificationSystems.smsSender;
import user.user;
import thirdParty.epostalMailSender;
import interfaces.notificationSender;
public class Main {
    public static void main(String[] args) {
        user _user = new user("Mainul", "01796110486", "mhsiam121@gmail.com");
        // user = GetUserFromDB();
        notificationSender notSender = new smsSender(_user);
        notSender.sendNotification("Welcome");

        epostalMailSender epmSender = new epostalMailSender();


        notificationSender notSender2 = new epostalMailAdapter(epmSender, _user,200);
        notSender2.sendNotification( "Congrates!");

        notificationSender notSender3 = new emailSender(_user);
        notSender3.sendNotification("Welcome");
    }
}