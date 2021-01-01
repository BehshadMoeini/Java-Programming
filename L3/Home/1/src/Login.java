import java.util.Scanner;

public class Login {
    public static final String NAME = "Ali" , USERNAME = "qwert" , PASSWORD = "12345";
    private String nam , use , pas;
    public void setNam(String nam) {
        this.nam = nam;
    }
    public void setUse(String use) {
        this.use = use;
    }
    public void setPas(String pas) {
        this.pas = pas;
    }
    public void setUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        setNam(scanner.nextLine());
        System.out.print("Enter Username: ");
        setUse(scanner.nextLine());
        System.out.print("Enter Password: ");
        setPas(scanner.nextLine());
    }
    public void checkUserData() throws LoginException {
        if (!(nam.equals(NAME)))
            throw new LoginException("Wrong Name!");
        if (!(use.equals(USERNAME)))
            throw new LoginException("Wrong Username!");
        if (!(pas.equals(PASSWORD)))
            throw new LoginException("Wrong Password!");
        else
            System.out.println("Login Successful!");
    }
}