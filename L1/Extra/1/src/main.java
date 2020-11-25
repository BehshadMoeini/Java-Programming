import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        System.out.print("Enter Rectangle Length: ");
        String temp = scan.nextLine();
        float tmp = Integer.parseInt(temp);
        rec.setLength(tmp);
        System.out.print("Enter Rectangle Width: ");
        temp = scan.nextLine();
        tmp = Integer.parseInt(temp);
        rec.setWidth(tmp);
        System.out.println("Length: " + rec.getLength() + "\tWidth: " + rec.getWidth());
        rec.perimeter();
        rec.area();
    }
}