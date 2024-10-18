package notificationSystems;

import interfaces.notificationSender;
import user.user;

public class emailSender implements notificationSender {
    user _user;
    public emailSender(user _user) {
        this._user = _user;
    }
    @Override
    public void sendNotification(String notification) {
        System.out.println("Sent notification through email. Sent to " + _user.getMail());
    }
}
