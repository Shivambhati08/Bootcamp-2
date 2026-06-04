//Rotate array from given position according to a type 'L' or 'R' and then switch the case upto given position.

import java.util.Scanner;
public class assesque1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        char ch = sc.next().charAt(0);
        String ans = "";
        int len = str.length();
        n = n % len;
        if(ch == 'L'){
                ans += str.substring(n) + str.substring(0, n);
        }
        else{
                ans += str.substring(len-n) + str.substring(0, len-n);
        }
        char arr[] = ans.toCharArray();
        for (int i = 0; i < n && i < arr.length; i++) {
            if(Character.isUpperCase(arr[i])){
                arr[i] = Character.toLowerCase(arr[i]);
            }
            else if (Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        str = new String(arr);
        System.out.println(str);
        sc.close();
    }
}
