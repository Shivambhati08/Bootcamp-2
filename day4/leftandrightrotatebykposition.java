
import java.util.*;

public class leftandrightrotatebykposition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder("");
        int n = sc.nextInt();
        char ch = sc.next().charAt(0);
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (ch == 'L') {
                sb.append(str.charAt((i + n) % len));
            } else {
                sb.append(str.charAt((i-n+len)%len));
            }
        }
        for (int i = 0; i < n; i++) {
            char c = sb.charAt(i);
            c = Character.toUpperCase(ch);
            sb.setCharAt(i, c);
        }
        str = sb.toString();
        System.out.println(str);
    }
}
