import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String s = "abbaca";
        String ans = "";
        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        for (char c : stack) {
            ans += c;
        }

        System.out.println(ans);

    }
}
