
import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int top = 0, bottom = r-1;
        int left = 0, right = c-1;
        while(top <= bottom && left <= right){
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j]+" ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right]+" ");
            }
            right--;
            if(top <= bottom){
            for (int j = right; j >= left; j--) {
                System.out.print(arr[bottom][j]+" ");
            }
            bottom--;
            }
            if(left <= right){
                for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left]+" ");
            }
            left++;
            }
        }
    }
}
