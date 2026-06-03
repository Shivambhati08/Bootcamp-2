
// import java.util.Scanner;


// public class printoddsumelements {
//     class node{
//         int data;
//         node next;
//         node(int data){
//             this.data = data;
//             this.next = null;
//         }
//         public node head;
//         public void insert(int data){
//             node newnode = new node(data);
//             if(head == null){
//                 head = newnode;
//                 return;
//             }
//             node temp = head;
//             while(temp.next != null){
//                 temp = temp.next;
//             }
//             temp.next = newnode;
//         }
//         public void print(){
//             node temp = head;
//             while(temp != null){
//                 System.out.print(temp.data+" ");
//             }
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         printoddsumelements ll = new printoddsumelements();
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             int ele = sc.nextInt();
//             int temp = ele;
//             int rev = 0;
//             int sum = 0;
//             while(temp != 0){
//                 sum = temp % 10;
//                 temp /= 10;
//             }
//             if(sum % 2 != 0){
                
//             }

//         }
//     }
    
// }

import java.util.Scanner;

public class printoddsumelements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = arr[0] - arr[n - 1];
        System.out.println(result);
        sc.close();
    }
}
