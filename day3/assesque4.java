//Replace a specified pattern from a string with the given character

import java.util.Scanner;
public class assesque4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String pattern = sc.nextLine();
        String str1 = sc.nextLine();
        System.out.println(str.replace(pattern, str1));
        sc.close();
    }
}