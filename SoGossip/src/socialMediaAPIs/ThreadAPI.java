package socialMediaAPIs;

import java.util.List;
import concreteClasses.SocialMediaAccount;

public class ThreadAPI {
    SocialMediaAccount thAccount;
    public ThreadAPI(SocialMediaAccount _account){
        thAccount = _account;
    }
    public void delete_Notification(){
        System.out.println("Deleting notification from Thread");

        thAccount.deleteNotification();
    }
    public void mark_As_Read(){
        System.out.println("Marking notification as read from Thread");

        thAccount.markAsRead();
    }
    public void mark_As_Unread(){
        System.out.println("Marking notification as unread from Thread");

        thAccount.markAsUnread();
    }
    public void get_Notifications() {
        System.out.println("Getting notifications from Thread");
        thAccount.getNotifications();
    }
}
