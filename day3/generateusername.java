
import java.util.Scanner;


public class generateusername {
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