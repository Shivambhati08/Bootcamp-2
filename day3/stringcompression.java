
import java.util.Scanner;

public class stringcompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        int i = 0;
        while(i < str.length()){
            int count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                    count++;
                    i++;
            }
            ans += str.charAt(i);
            if(count > 1){
                ans += count;
                
            }
            i++;
        }
        System.out.println(ans);
    }
}
