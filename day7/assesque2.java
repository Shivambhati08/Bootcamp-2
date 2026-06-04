// Reverse the words pushed into the stack

/*
problem 2:
pseudocode:
for each element:
    pop all character
    print space
pop remaining all characters
 */
import java.util.Scanner;
import java.util.Stack;
public class assesque2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<String> stack = new Stack<>();
        String words[] = str.split(" ");
        for(String word: words){
            stack.push(word);
        } 
        while(!stack.empty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
