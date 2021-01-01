import java.util.Scanner;

public class Math {
    private double a , b , c;
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public void math() throws MathException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b & c for the equation (aX^2 + bX + c = 0): ");
        setA(scanner.nextDouble());
        setB(scanner.nextDouble());
        setC(scanner.nextDouble());
        double d = (b*b)-(4*a*c);
        if (d<0)
            throw new MathException("Delta is negative!");
        else {
            double x1 = ((-1*b)+java.lang.Math.sqrt(d))/(2*a);
            double x2 = ((-1*b)-java.lang.Math.sqrt(d))/(2*a);
            System.out.println("X1: " + x1 + "\nX2: " + x2);
        }
    }
}
