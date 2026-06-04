// Valid Parenthesis (Through String)

import java.util.Scanner;
public class pracque11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int low = 0;
        int high = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '('){
                low++;
                high++;
            }
            else if(ch == ')'){
                low--;
                high--;
            }
            else{
                low--;
                high++;
            }
            if(high < 0){
                System.out.print("Not valid");
                return;
            }
            low = Math.max(low, 0);
        }
        if(low == 0){
            System.out.println("valid");
        }
        else{
            System.out.println("Not Valid");
        }
        sc.close();
    }
    
}
