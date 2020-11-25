import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Course programming = new Course();
        Course programmingWorkshop = new Course();
        Course math2 = new Course();


        System.out.print("Enter Programming Score: ");
        String temp = scan.nextLine();
        programming.score = Float.parseFloat(temp);
        System.out.print("Enter Programming Units: ");
        temp = scan.nextLine();
        programming.units = Integer.parseInt(temp);
        programming.multiply();

        System.out.print("Enter Programming Workshop Score: ");
        temp = scan.nextLine();
        programmingWorkshop.score = Float.parseFloat(temp);
        System.out.print("Enter Programming Workshop Units: ");
        temp = scan.nextLine();
        programmingWorkshop.units = Integer.parseInt(temp);
        programmingWorkshop.multiply();

        System.out.print("Enter Math 2 Score: ");
        temp = scan.nextLine();
        math2.score = Float.parseFloat(temp);
        System.out.print("Enter Math 2 Units: ");
        temp = scan.nextLine();
        math2.units = Integer.parseInt(temp);
        math2.multiply();

        float scoreSum = programming.mul + programmingWorkshop.mul + math2.mul;
        float unitSum = programming.units + programmingWorkshop.units + math2.units;
        float avg = scoreSum / unitSum;
        boolean mashrot = false;
        if (avg <= 12)
            mashrot = true;
        System.out.println("Term Average: " + avg + "\nMashrot: " + mashrot);
    }
}
