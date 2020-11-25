public class X implements MyInteger {
    public int n;
    public boolean b = false;
    @Override
    public void isEven() {
        if (n%2==0) {
            b = true;
            System.out.println("isEven: " + b);
            b = false;
        }
        else
            System.out.println("isEven: " + b);
    }
    @Override
    public void isOdd() {
        if (n%2!=0) {
            b = true;
            System.out.println("isOdd: " + b);
            b = false;
        }
        else
            System.out.println("isOdd: " + b);
    }
    @Override
    public void isPositive() {
        if (n>=0) {
            b = true;
            System.out.println("isPositive: " + b);
            b = false;
        }
        else
            System.out.println("isPositive: " + b);
    }
    @Override
    public void isNegative() {
        if (n<0) {
            b = true;
            System.out.println("isNegative: " + b);
            b = false;
        }
        else
            System.out.println("isNegative: " + b);
    }
    @Override
    public void isZero() {
        if (n==0) {
            b = true;
            System.out.println("isZero: " + b);
            b = false;
        }
        else
            System.out.println("isZero: " + b);
    }
}
