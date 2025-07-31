import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.isEmpty());

        stack.push("CBR1000RR-R");
        stack.push("S1000RR");
        stack.push("GSX-R 1000");

        String myFavBike = stack.pop();


        System.out.println(stack);
        System.out.println(myFavBike);
        System.out.println(stack.peek());
        System.out.println(stack.search("S1000RR"));
    }

}
