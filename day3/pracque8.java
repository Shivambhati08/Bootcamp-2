// String compression using stringBuilder

import java.util.Scanner;
public class pracque8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < n){
            int count = 1;
            while(i < n-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count);
            }
            i++;
        }
        str = sb.toString();
        System.out.println(str);
        sc.close();
    }
}
