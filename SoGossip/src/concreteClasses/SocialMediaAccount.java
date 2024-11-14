package concreteClasses;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaAccount {
    List<String> Notifications;
    public SocialMediaAccount(){
        Notifications = new ArrayList<>();
        Notifications.add("Notification 1");
        Notifications.add("Notification 2");
        Notifications.add("Notification 3");
    }

    public void getNotifications() {
        for(String notification : Notifications){
            System.out.println(notification);
        }
    }

    public void deleteNotification(){
        System.out.println("Notification deleted");
    }
    public void markAsRead(){
        System.out.println("Notification marked as read");
    }
    public void markAsUnread(){
        System.out.println("Notification marked as unread");
    }
}
