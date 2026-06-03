
import java.util.Scanner;

public class stringcompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else{
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(i));
        sb.append(count);
        str = sb.toString();
        System.out.println(str);
    }
}
