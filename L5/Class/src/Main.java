import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Numbers (Example: a+b): ");
        String string = scanner.next();
        String[] strings = new String[3];
        for (int i=0 ; i<3 ; i++)
            strings[i] = String.valueOf(string.charAt(i));
        Calculate calculate = CalculateFactory.getCalculate(strings[1]);
        calculate.calc(strings);
    }
}