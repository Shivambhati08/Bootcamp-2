
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
            return;
        }
        int freq[] = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            freq[ch - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(freq[i]  != 0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
