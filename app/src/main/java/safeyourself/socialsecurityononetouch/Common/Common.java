package safeyourself.socialsecurityononetouch.Common;

public class Common {

    public static String CURRENT_USER;

    public static String getCurrentUser() {
        return CURRENT_USER;
    }

    public static void setCurrentUser(String currentUser) {
        CURRENT_USER = currentUser;
    }
}
