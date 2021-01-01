import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Entity tmp = new Entity();
        System.out.print("Enter Full Name: ");
        tmp.setName(scanner.next());
        System.out.print("Melli ID: ");
        tmp.setMelliID(scanner.nextInt());
        System.out.printf("Choose Car Model:\n1  Pride\t99\t80  M\n2  L90\t\t98\t100 M\n");
        switch (scanner.nextInt()) {
            case 1:
                editor("Pride",99,"80 M",tmp);
                break;
            case 2:
                editor("L90",98,"100 M",tmp);
                break;
        }
        reporter();
    }
    public static void editor(String t1, int t2, String t3, Entity tmp) {
        try {
            Service.getInstance().save(new Entity().setMelliID(tmp.getMelliID()).setName(tmp.getName()).setcName(t1).setcYear(t2).setcPrice(t3));
        } catch (Exception e) {
            System.out.println("failed to save " + e.getMessage());
        }
    }
    public static void reporter() {
        List<Entity> entityList = null;
        try {
            entityList = Service.getInstance().report();
        } catch (Exception e) {
            System.out.println("failed to report " + e.getMessage());
        }
        for (Entity entity : entityList) {
            System.out.println(entity.getMelliID());
            System.out.println(entity.getName());
            System.out.println(entity.getcName());
            System.out.println(entity.getcYear());
            System.out.println(entity.getcPrice());
        }
    }
}