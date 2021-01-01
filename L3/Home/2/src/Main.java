public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        try {
            math.math();
        } catch (MathException e) {
            e.printStackTrace();
        }
    }
}