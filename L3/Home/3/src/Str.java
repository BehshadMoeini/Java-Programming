import java.util.Scanner;

public class Str {
    public String str;
    public void setStr(String str) {
        this.str = str;
    }
    public void str() throws StrException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        setStr(scanner.nextLine());
        if (str.matches(".*\\d.*"))
            throw new StrException("String Contains Number(s)!");
        else
            System.out.println("String Length: " + str.length());
    }
}