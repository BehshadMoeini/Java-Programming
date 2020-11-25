public class three {
    public static void main(String[] args) {
        int n = 3;
        switch (n) {
            case 1: {
                System.out.println("N = " + n);
                break;
            }
            case 2: {
                System.out.println("N = " + (n+1));
                break;
            }
            case 3: {
                System.out.println("N = " + (n*2));
                break;
            }
            default: {
                System.out.println("!");
            }
        }
    }
}
