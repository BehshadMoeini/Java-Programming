import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Equation z = new Equation();

        System.out.print("Enter a: ");
        String temp = scan.nextLine();
        z.a = Float.parseFloat(temp);

        System.out.print("Enter b: ");
        temp = scan.nextLine();
        z.b = Float.parseFloat(temp);

        System.out.print("Enter c: ");
        temp = scan.nextLine();
        z.c = Float.parseFloat(temp);

        System.out.print("Enter d: ");
        temp = scan.nextLine();
        z.d = Float.parseFloat(temp);

        System.out.print("Enter e: ");
        temp = scan.nextLine();
        z.e = Float.parseFloat(temp);

        System.out.print("Enter f: ");
        temp = scan.nextLine();
        z.f = Float.parseFloat(temp);

        z.calcX();
        z.calcY();
    }
}
