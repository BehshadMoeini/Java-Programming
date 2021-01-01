public class Main {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCar(Car.BENZ);
        Car car2 = CarFactory.getCar(Car.BMW);
        Car car3 = CarFactory.getCar(Car.LEXUS);
        car1.start();
        car2.start();
        car3.start();
    }
}