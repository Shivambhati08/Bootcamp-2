//Largest Element in an array

import java.util.Scanner;
public class pracque2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println(largest);
        sc.close();
    }
}
