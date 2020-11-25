package two;

public class Main {
    public static void main(String[] args) {
        int max=(-1000) , arr[]={0,2,4,6,8,7,9,3,5,1};
        for (int x : arr) {
            if (x > max)
                max = x;
        }
        System.out.println("Maximum: " + max);
    }
}