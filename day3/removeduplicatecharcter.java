
import java.util.Scanner;

public class removeduplicatecharcter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ans.indexOf(ch) == -1){
                ans += ch;
            }
        }
        System.out.println(ans);
    }
}
