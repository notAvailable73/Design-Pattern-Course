import concreteClasses.SocialMediaAccount;
import facades.SocialMediaFacade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SocialMediaAccount fbAccount = new SocialMediaAccount();
        SocialMediaAccount instaAccount = new SocialMediaAccount();
        SocialMediaAccount threadAccount = new SocialMediaAccount();

        SocialMediaFacade smFacade = new SocialMediaFacade(fbAccount,instaAccount,threadAccount);

        smFacade.getAllNotifications();
    }
}