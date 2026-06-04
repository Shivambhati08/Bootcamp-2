// sum of elements in a queue

import java.util.*;
import java.util.LinkedList;
public class assesque1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        int sum = 0;
        for(int ele : q){
            sum += ele;
        }
        System.out.println(sum);
    }
    
}
