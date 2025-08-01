import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        String[] s = {"Hello", "World", "Java"};
        Stack<String> stack = new Stack<>();

        for (String word : s) {
            stack.push(word);
        }
        System.out.println(stack);

        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}
