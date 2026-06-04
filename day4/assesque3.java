
import java.util.*;

public class assesque3 {
     public static void getpermute(char[] arr, int idx){
        if(idx == arr.length){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }
        for(int i = idx; i < arr.length; i++){
            char ch = arr[i];
            arr[i] = arr[idx];
            arr[idx] = ch;
            getpermute(arr, idx+1);
            ch = arr[i];
            arr[i] = arr[idx];
            arr[idx] = ch;
        }
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        getpermute(arr, 0);
        sc.close();
    }
}
