
import java.util.Scanner;

public class rotatestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        char ch = sc.next().charAt(0);
        String rotate = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if(ch == 'L'){
            rotate += str.charAt((i+n)%len);
            }
            else if(ch == 'R'){
            rotate += str.charAt((i-n+len)%len);
            }
        }
       rotate = rotate.substring(0, n).toUpperCase() + rotate.substring(n);
        System.out.println(rotate);
    }
}
