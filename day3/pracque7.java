//Longest Palindromic Subsequence

import java.util.Scanner;
public class pracque7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        int n = str.length();
        int dp[][] = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(str.charAt(i-1) == rev.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        System.out.println(dp[n][n]);
        sc.close();
    }
}
