//Print leaders in an array

import java.util.*;
public class pracque1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = n-1; i >=0; i--) {
            if(max < arr[i]){
                max = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        for(int ele :list){
            System.out.print(ele+" ");
        }
        sc.close();
    }
}


// bruteforce in O(n2)

// import java.util.*;
// public class pracque1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for (int i = 0; i < n; i++) {
//             boolean flag = true;
//             for (int j = i+1; j < n; j++) {
//                 if(arr[i] < arr[j]){
//                     flag = false;
//                 }
//             }
//             if(flag){
//                 System.out.print(arr[i]+" ");
//             }
//         }
//         sc.close();
//     }
// }
