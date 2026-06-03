// Reverse each column of a matrix

import java.util.Scanner;

public class pracque4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row/2; i++) {
                int temp = arr[i][j];
                arr[i][j] = arr[row-i-1][j];
                arr[row-i-1][j] = temp;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
