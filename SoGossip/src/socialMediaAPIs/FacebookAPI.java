package socialMediaAPIs;

import java.util.List;
import concreteClasses.SocialMediaAccount;
public class FacebookAPI {
    SocialMediaAccount fbaccount;
    public FacebookAPI(SocialMediaAccount _account){
        fbaccount = _account;
    }
    public void deleteNotification(){
        System.out.println("Deleting notification from Facebook");

        fbaccount.deleteNotification();
    }
    public void markAsRead(){
        System.out.println("Marking notification as read from Facebook");

        fbaccount.markAsRead();
    }
    public void markAsUnread(){
        System.out.println("Marking notification as unread from Facebook");

        fbaccount.markAsUnread();
    }
    public void getNotifications() {
        System.out.println("Getting notifications from Facebook");
        fbaccount.getNotifications();
    }
}
