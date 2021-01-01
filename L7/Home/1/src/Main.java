import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Service.getInstance().save(new Entity());
        } catch (Exception e) {
            System.out.println("failed to save " + e.getMessage());
        }
        Scanner scanner = new Scanner(System.in);
        String temp = null;
        System.out.printf("Enter Username: ");
        String user = scanner.next();
        try {
            if (user.equals(Service.getInstance().report().get(0).getUsername()))
                temp = Service.getInstance().report().get(0).getPassword();
            else {
                System.out.println("User doesn't exist");
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("failed to report " + e.getMessage());
        }
        System.out.printf("Enter Password: ");
        String pass = scanner.next();
        if (pass.equals(temp))
            System.out.println("Login Successful");
        else {
            System.out.println("Wrong Password");
            System.exit(0);
        }
        info();
        System.out.println("\nChoose data plan\n1 - 2 Gb\t1000 t\n2 - 4 Gb\t2000 t\n3 - 10 Gb\t5000 t\n4 - 25 Gb\t10000 t");
        switch (scanner.nextInt()) {
            case 1:
                updater(1000,2);
                break;
            case 2:
                updater(2000,4);
                break;
            case 3:
                updater(5000,10);
                break;
            case 4:
                updater(10000,25);
                break;
        }
    }
    public static void info() {
        List<Entity> entityList = null;
        try {
            entityList = Service.getInstance().report();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Entity entity : entityList) {
            System.out.println(entity.getUsername());
            System.out.println(entity.getBill());
            System.out.println(entity.getDataPlan());
        }
    }
    public static void updater(int t1, int t2) {
        try {
            Service.getInstance().edit(new Entity().setBill((Service.getInstance().report().get(0).getBill())+t1).setDataPlan((Service.getInstance().report().get(0).getDataPlan())+t2).setId(Service.getInstance().report().get(0).getId()).setUsername(Service.getInstance().report().get(0).getUsername()).setPassword(Service.getInstance().report().get(0).getPassword()));
            info();
        } catch (Exception e) {
            System.out.println("failed to update " + e.getMessage());
        }
    }
}