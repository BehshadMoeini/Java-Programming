public class Main {
    public static void main(String[] args) {
        Str str = new Str();
        try {
            str.str();
        } catch (StrException e) {
            e.printStackTrace();
        }
    }
}