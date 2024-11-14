package socialMediaAPIs;

import concreteClasses.SocialMediaAccount;

import java.util.List;

public class InstagramAPI {
    SocialMediaAccount instaaccount;
    public InstagramAPI(SocialMediaAccount _account){
        instaaccount = _account;
    }
    public void deleteNotification(){
        System.out.println("Deleting notification from instagram");

        instaaccount.deleteNotification();
    }
    public void markAsRead(){
        System.out.println("Marking notification as read from instagram");

        instaaccount.markAsRead();
    }
    public void markAsUnread(){
        System.out.println("Marking notification as unread from instagram");

        instaaccount.markAsUnread();
    }
    public void getNotifications() {
        System.out.println("Getting notifications from instagram");
        instaaccount.getNotifications();
    }
}
