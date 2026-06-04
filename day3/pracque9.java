// Longest Substring without repeating Characters 

import java.util.Scanner;
public class pracque9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int freq[] = new int[128];
        int left = 0;
        int maxlength = 0;
        for (int right = 0; right <str.length() ; right++) {
            char ch = str.charAt(right);
            while(freq[ch] > 0){
                freq[str.charAt(left)]--;
                left++;
            }
            freq[ch]++;
            maxlength = Math.max(maxlength, right-left + 1);
        }
        System.out.println(maxlength);
    }
}
