package notificationSystems;

import interfaces.notificationSender;
import user.user;

public class smsSender implements notificationSender {
    user _user;
    public smsSender(user _user) {
        this._user = _user;
    }
    @Override
    public void sendNotification(String notification) {
        System.out.println("Sent notification through sms. Sent to " + _user.getPhoneNum());
    }
}
