// Longest Common Prefix 

import java.util.Scanner;
public class pracque5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    System.out.println("");
                    return;
                }
            }
        }
        System.out.println(prefix);
        sc.close();
    }
}
