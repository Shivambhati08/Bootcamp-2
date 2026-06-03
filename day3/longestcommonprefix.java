import java.util.Scanner;
public class longestcommonprefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        // Input strings
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        String prefix = arr[0];
        for (int i = 1; i < n; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("");
                    return;
                }
            }
        }
        System.out.println("Longest Common Prefix: " + prefix);
    }
}

