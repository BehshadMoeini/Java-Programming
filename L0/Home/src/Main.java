public class Main {
    public static void main(String[] args) {
        int n=8 , arr[]={0,1,2,3,4,5,6,7,8,9};
        boolean r = false;
        for (int num : arr) {
            if (num==n) {
                r = true;
                break;
            }
        }
        System.out.println("Result: " + r);
    }
}
