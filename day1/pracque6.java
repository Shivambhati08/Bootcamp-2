//Delete smallest element from an array

import java.util.Scanner;
public class pracque6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        for (int i = index; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
