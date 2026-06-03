//Diagonal Difference in Matrix

import java.util.Scanner;
public class pracque6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int primarydiagonalsum = 0;
        int secondarydiagonalsum = 0;
         for (int i = 0; i < n; i++) {
                primarydiagonalsum += arr[i][i];
                secondarydiagonalsum += arr[i][n-i-1];
            }
        int difference = Math.abs(primarydiagonalsum - secondarydiagonalsum);
        System.out.println("Difference of diagonal: "+difference);
        sc.close();
    }
}
