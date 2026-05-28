
import java.util.Scanner;

public class reversecolumnandchangetonegativeevenrows {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i % 2 == 0){
                    arr[i][j] = -arr[i][j];
                }
            }
        }
        for (int j = 0; j < n; j++) {
            int top = 0;
            int bottom = n-1;
            while(top < bottom){
                int temp = arr[top][j];
                arr[top][j] = arr[bottom][j];
                arr[bottom][j] = temp;
                top++;
                bottom--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
