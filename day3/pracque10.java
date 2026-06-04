// Minimum Window Substring

import java.util.Scanner;
public class pracque10 {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int[] freq = new int[128];
        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }
        int left = 0;
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (freq[ch] > 0) {
                count--;
            }
            freq[ch]--;

            while (count == 0) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                freq[leftChar]++;
                if (freq[leftChar] > 0) {
                    count++;
                }
                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + minLen);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();
        String ans = minWindow(s, t);
        System.out.println(ans);
        sc.close();
    }
}
