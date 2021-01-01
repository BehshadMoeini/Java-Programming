public class CarFactory {
    public static Car getCar (int i) {
        switch (i) {
            case 0:
                return new Benz();
            case 1:
                return new Bmw();
            case 2:
                return new Lexus();
            default:
                return null;
        }
    }
}