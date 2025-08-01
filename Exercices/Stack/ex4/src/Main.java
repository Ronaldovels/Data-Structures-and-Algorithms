import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        String s = "2 3 + 5 *";
        Stack<Integer> stack = new Stack<>();
        String[] tokens = s.trim().split("\\s+");

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int subOperand2 = stack.pop();
                    int subOperand1 = stack.pop();
                    stack.push(subOperand1 - subOperand2);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int divOperand2 = stack.pop();
                    int divOperand1 = stack.pop();
                    if (divOperand2 == 0) {
                        System.out.println("Divisão por zero não permitida.");
                        break;
                    }
                    stack.push(divOperand1 / divOperand2);
                    break;
                default:
                        stack.push(Integer.parseInt(token));
                        break;
            }
        }

        System.out.println(stack.pop());

    }

}
