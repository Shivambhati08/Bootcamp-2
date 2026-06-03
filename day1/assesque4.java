//Take a matrix as input, then take addType (0= row, 1= column) and add index as input, then add elements. Later take deleteType (0= row, 1= column) and delete index as input & delete elements.

import java.util.Scanner;

public class assesque4 {

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
        int addtype = sc.nextInt();
        int addindex = sc.nextInt();
        if (addtype == 0) {
            for (int j = 0; j < col; j++) {
                arr[addindex][j] = sc.nextInt();
            }
        } else {
            for (int i = 0; i <row; i++) {
                arr[i][addindex] = sc.nextInt();
            }
        }
        int deltype = sc.nextInt();
        int delindex = sc.nextInt();
        if (deltype == 0) {
            for (int i = 0; i < row; i++) {
                if (delindex == i) {
                    continue;
                }
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (delindex == j) {
                        continue;
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
