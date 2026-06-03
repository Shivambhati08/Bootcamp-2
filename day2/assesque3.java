//Find element having frequency greater than threshold= n/4 in an n sized array

import java.util.Scanner;
public class assesque3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n/4;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int freq[] = new int[n];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < n; i++) {
             if(freq[i] > count){
                System.out.print(i);
                return;
             }
        }
        sc.close();
    }
}
