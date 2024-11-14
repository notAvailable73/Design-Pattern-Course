package facades;

import concreteClasses.SocialMediaAccount;
import socialMediaAPIs.FacebookAPI;
import socialMediaAPIs.InstagramAPI;
import socialMediaAPIs.ThreadAPI;

public class SocialMediaFacade {
    private FacebookAPI fbAPI;
    private InstagramAPI instaAPI;
    private ThreadAPI thAPI;

    public SocialMediaFacade(SocialMediaAccount fbAccount, SocialMediaAccount instaAccount, SocialMediaAccount thAccount){
        fbAPI = new FacebookAPI(fbAccount);
        instaAPI = new InstagramAPI(instaAccount);
        thAPI = new ThreadAPI(thAccount);
    }

    public void deleteNotification(){
        //delete notification
    }
    public void markAsRead(){
        // mark as read
    }
    public void markAsUnread(){
        // mark as unread
    }
    public void getAllNotifications() {
        fbAPI.getNotifications();
        instaAPI.getNotifications();
        thAPI.get_Notifications();
    }


}
