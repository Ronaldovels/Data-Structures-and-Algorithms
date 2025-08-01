import java.util.Stack;

public class Main {

    public static void main(String[] args) {


        String s = "Hello World!";
        String ans = "";
        Stack<Character> stack = new Stack<>();

        for (char character : s.toCharArray()) {
            stack.push(character);
        }

        while (!stack.isEmpty()){
            ans += stack.pop();
        }
        System.out.println(ans);
    }

}
