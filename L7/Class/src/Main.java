import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Service.getInstance().save(new Entity());
        } catch (Exception e) {
            System.out.println("failed to save " + e.getMessage());
        }
        try {
            Service.getInstance().report();
        } catch (Exception e) {
            System.out.println("failed to report " + e.getMessage());
        }
        Scanner scanner = new Scanner(System.in);
        int temp1;
        String temp2 = null;
        System.out.printf("Enter Username: ");
        String user = scanner.next();
        if (Repository.users.contains(user) == false) {
            System.out.println("User doesn't exist");
            System.exit(0);
        } else {
            temp1 = Repository.users.indexOf(user);
            temp2 = Repository.passes.get(temp1);
        }
        System.out.printf("Enter Password: ");
        String pass = scanner.next();
        if (pass.equals(temp2))
            System.out.println("Login Successful");
        else
            System.out.println("Wrong Password");
        System.exit(0);
    }
}