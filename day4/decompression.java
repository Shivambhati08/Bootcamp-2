import java.util.Stack;
public class decompression{
    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int k = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            }
            else if(ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);

                k = 0;
                currentString = "";
            }
            else if(ch == ']') {
                int count = countStack.pop();
                String prevString = stringStack.pop();
                StringBuilder temp = new StringBuilder(prevString);
                for(int j = 0; j < count; j++) {
                    temp.append(currentString);
                }
                currentString = temp.toString();
            }
            else {
                currentString += ch;
            }
        }
        System.out.println(currentString);
    }
}