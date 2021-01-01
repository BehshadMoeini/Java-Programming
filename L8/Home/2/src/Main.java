public class Main {
    public static void main(String[] args) {
        try {
            Service.getInstance().save(new Entity());
        } catch (Exception e) {
            System.out.println("failed to save " + e.getMessage());
        }
        try {
            Service.getInstance().report();
        } catch (Exception e) {
            System.out.println("failed to report " + e.getMessage());
        }
        Form form = new Form();
    }
}