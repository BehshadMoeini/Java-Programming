public class CalculateFactory {
    public static Calculate getCalculate(String c) {
        switch (c) {
            case "+":
                return new CalcPlus();
            case "-":
                return new CalcMinus();
            default:
                return null;
        }
    }
}
