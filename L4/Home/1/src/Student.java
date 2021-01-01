import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
    public Student() {
        Scanner scanner = new Scanner(System.in);
        Map map = new TreeMap();
        System.out.print("Enter Student Number: ");
        map.put("Student Number",scanner.nextLine());
        System.out.print("Enter Student Name: ");
        map.put("Name",scanner.nextLine());
        System.out.print("Enter Average: ");
        map.put("Average",scanner.nextLine());
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}