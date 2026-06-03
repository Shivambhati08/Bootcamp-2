//check string is palindrome

import java.util.Scanner;
public class assesque3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        for (int i = 0; i <str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println(str+" is not a palindrome");
                return;
            }
        }
        System.out.println(str+" is a palindrome");
        sc.close();
    }
}
