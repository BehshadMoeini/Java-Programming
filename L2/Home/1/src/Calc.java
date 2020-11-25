public class Calc {
    public int a , b;
    public void sum () {
        System.out.println("Summation: " + (a+b));
    }
    public void sub () {
        if (a > b)
            System.out.println("Subtraction: " + (a-b));
        else
            System.out.println("Subtraction: " + (b-a));
    }
    public void mul () {
        System.out.println("Multiplication: " + (a*b));
    }
    public void div () {
        if (b==0) {
            System.out.print("Division: Not Possible!");
            System.exit(0);
        }
        else
            System.out.println("Division: " + (a/b));
    }
}