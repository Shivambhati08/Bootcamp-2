//Generate username from name and id in pattern: firstname_lastname<id>

import java.util.Scanner;
public class assesque2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String id = sc.nextLine();
        name = name.trim().toLowerCase();
        String[] parts = name.split("\\s+");

        String firstName = parts[0];
        String lastName = parts[parts.length - 1];
        String username = firstName + "_" + lastName + id;
        System.out.println(username);
    }
}

// bruteforce

// import java.util.Scanner;
// public class assesque2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String id = sc.nextLine();
//         String firstname = "";
//         String lastname = "";
//         for(int i = 0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch != ' '){
//                 firstname += ch;
//             }
//             else{
//                 break;
//             }
//         }
//         for (int i = str.length()-1; i >= 0; i--) {
//             char ch = str.charAt(i);
//             if(ch != ' '){
//                 lastname = ch + lastname;
//             }
//             else{
//                 break;
//             }
//         }
//         String username = firstname +"_" + lastname + id;
//         System.out.println(username);
//         sc.close();
//     }
// }