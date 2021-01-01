import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int a, b, c, d;


        System.out.println("Enter your salary");
        a = input.nextInt();
        System.out.println("Enter your loan");
        b = input.nextInt();
        System.out.println("Enter your rent");
        c = input.nextInt();
        d = a - b - c;
        System.out.println("Your balance is" + d);
    }
}