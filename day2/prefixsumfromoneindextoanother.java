import java.util.Scanner;

public class prefixsumfromoneindextoanother{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int arr[] = new int[50];
            int prefix[] = new int[50];
            prefix[0] = 0;
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                prefix[i] = prefix[i-1]+arr[i-1];
            }
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = prefix[r] - prefix[l-1];
            System.out.println(sum);
            sc.close();
    }
}