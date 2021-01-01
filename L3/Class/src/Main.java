public class Main {
    public static void main(String[] args) {
        User[] user = new User[2];
        user[0] = new User();
        user[1] = new User();
        for (int i=0 ; i<2 ; i++)
            user[i].setUser();

        try {
            User.search(user);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }
}