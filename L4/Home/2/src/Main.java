import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gen gen = new Gen();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        gen.setU(scanner.nextLine());
        System.out.print("Password: ");
        gen.setP(scanner.nextLine());

        Gen gen1 = new Gen();
        try {
            gen1 = (Gen) gen.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported!");
        }
        Gen gen2 = new Gen();
        try {
            gen2 = (Gen) gen.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported!");
        }
        Gen gen3 = new Gen();
        try {
            gen3 = (Gen) gen.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported!");
        }

        System.out.println(gen + "\t" + gen.getU() + "\t" + gen.getP());
        System.out.println(gen1 + "\t" + gen1.getU() + "\t" + gen1.getP());
        System.out.println(gen2 + "\t" + gen2.getU() + "\t" + gen2.getP());
        System.out.println(gen3 + "\t" + gen3.getU() + "\t" + gen3.getP());
    }
}