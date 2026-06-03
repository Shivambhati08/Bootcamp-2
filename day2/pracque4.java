//Frequency sort

import java.util.*;
public class pracque4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Integer nums[] = new Integer[n];
        for(int i = 0; i < n; i++){
            nums[i] = arr[i];
        }
        Arrays.sort(nums, (a, b) -> {
            int freq1 = map.get(a);
            int freq2 = map.get(b);
            if(freq1 != freq2){
                return freq2 - freq1;
            }
            return a - b;
        });
        for(int x : nums){
            System.out.print(x + " ");
        }
        sc.close();
    }
}