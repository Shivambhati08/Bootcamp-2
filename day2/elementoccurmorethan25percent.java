
import java.util.Scanner;

public class elementoccurmorethan25percent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n/4;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
