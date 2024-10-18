package notificationSystems;

import interfaces.notificationSender;
import thirdParty.epostalMailSender;
import user.user;

public class epostalMailAdapter implements notificationSender {
    epostalMailSender epmSender;
    user _user;
    int code;
    public epostalMailAdapter(epostalMailSender _epmSender, user _user, int _code){
        epmSender = _epmSender;
        this._user = _user;
        code = _code;
    }
    @Override
    public void sendNotification(String notification) {
        epmSender.sendEpostalMail(code, _user, notification);
    }
}
