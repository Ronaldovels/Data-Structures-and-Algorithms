import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Map<Character, Character> charMap = new HashMap<Character, Character>();
        Stack<Character> stack = new Stack<import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

        public class Main {

            public static void main(String[] args) {
                Map<Character, Character> charMap = new HashMap<Character, Character>();
                Stack<Character> stack = new Stack<>();

                charMap.put(')', '(');
                charMap.put(']', '[');
                charMap.put('}', '{');

                String s = "({[]})";
                char[] charArray = s.toCharArray();

                for (char c : charArray) {
                    if (charMap.containsValue(c)) {
                        stack.push(c);
                    } else if (charMap.containsKey(c)) {
                        if (stack.isEmpty() || charMap.get(c) != stack.pop()) {
                            break;
                        }
                    }
                }
                System.out.println(stack.isEmpty());





            }

        }
>();

        charMap.put(')', '(');
        charMap.put(']', '[');
        charMap.put('}', '{');

        String s = "({[]})";
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (charMap.containsValue(c)) {
                stack.push(c);
            } else if (charMap.containsKey(c)) {
                if (stack.isEmpty() || charMap.get(c) != stack.pop()) {
                    break;
                }
            }
        }
        System.out.println(stack.isEmpty());





    }

}
