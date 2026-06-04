//Print unique permutations of a given string

import java.util.*;
public class assesque4 {
    static TreeSet<String> set = new TreeSet<>();
    public static void permutation(String str, String ans) {
        if (str.length() == 0) {
            set.add(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permutation(remaining, ans + ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        permutation(str, "");
        for (String s : set) {
            System.out.println(s);
        }
        sc.close();
    }
}