import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calc cal = new Calc();

        System.out.print("Enter 1st Number: ");
        String tmp = scan.nextLine();
        int temp = Integer.parseInt(tmp);
        cal.a = temp;
        System.out.print("Enter 2nd Number: ");
        tmp = scan.nextLine();
        temp = Integer.parseInt(tmp);
        cal.b = temp;

        cal.sum();
        cal.sub();
        cal.mul();
        cal.div();
    }
}