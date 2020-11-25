public class three {
    public static void main(String[] args) {
        int i , j , k , l=0 , arr[][][] = new int[3][3][3];
        for (i=0 ; i<3 ; i++) {
            for (j=0 ; j<3 ; j++) {
                for (k=0 ; k<3 ; k++,l++)
                    arr[i][j][k] = l;
            }
        }
        for (i=0 ; i<3 ; i++) {
            for (j=0 ; j<3 ; j++) {
                for (k=0 ; k<3 ; k++)
                    System.out.print(arr[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
