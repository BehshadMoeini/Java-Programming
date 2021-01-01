import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        student.setName(scanner.nextLine());
        System.out.print("Student Number: ");
        student.setNumber(scanner.nextLine());
        System.out.print("Father Name: ");
        student.setFather(scanner.nextLine());

        student.setScores();
    }
}