
import java.util.Scanner;

public class dignonaldifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int maindiagonalsum = 0;
        int antidiagonalsum = 0;
         for (int i = 0; i < n; i++) {
                maindiagonalsum += arr[i][i];
                antidiagonalsum += arr[i][n-i-1];
            }
        int difference = Math.abs(maindiagonalsum - antidiagonalsum);
        System.out.println("Difference of diagonal: "+difference);
    }
}
