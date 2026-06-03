// Sort 0s, 1s and 2s (DNF Algorithm)

import java.util.Scanner;
public class pracque7 {
    public static void swap(int arr[], int n, int m){
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while(mid <= high){
        if (arr[mid] == 0){
           swap(arr, low, mid);
            low++;
            mid++;
        } else if (arr[mid] == 2) {
           swap(arr, mid, high);
            high--;
        } else {
            mid++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
