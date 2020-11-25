import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Rectangle rec = new Rectangle();
        System.out.print("Enter Rectangle Lenght: ");
        String temp = scan.nextLine();
        rec.length = Integer.parseInt(temp);
        System.out.print("Enter Rectangle Width: ");
        temp = scan.nextLine();
        rec.width = Integer.parseInt(temp);
        rec.perimeter();
        rec.area();

        System.out.println();

        Square squ = new Square();
        System.out.print("Enter Square Side: ");
        temp = scan.nextLine();
        squ.side = Integer.parseInt(temp);
        squ.perimeter();
        squ.area();
    }
}
