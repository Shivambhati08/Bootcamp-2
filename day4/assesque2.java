//Find first non-repeating character in a string

import java.util.Scanner;
public class assesque2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int freq[] = new int[26];
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(freq[ch - 'a'] == 1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println(-1);
    }
}
