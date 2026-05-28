
import java.util.*;

public class leadersinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = n-1; i >= 0; i--) {
            if(max < arr[i]){
                max = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        for (int ele : list) {
            System.out.print(ele+" ");
        }
    }
}
