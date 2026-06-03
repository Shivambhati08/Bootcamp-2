//longest consecutive increasing subarray

import java.util.Scanner;
public class pracque3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxlength = 1;
        int currlength = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i-1] < arr[i]){
                currlength++;
            }
            else{
                currlength = 1;
            }
            maxlength = Math.max(maxlength , currlength);
        }
        System.out.println(maxlength);
        sc.close();
    }
}
