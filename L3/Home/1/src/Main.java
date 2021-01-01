public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        login.setUserData();
        try {
            login.checkUserData();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}