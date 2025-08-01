import java.util.Stack;

public class FilaComDuasPilhas {

    private final Stack<String> enqueueStack;
    private final Stack<String> dequeueStack;

    void showQueue() {
        System.out.println(enqueueStack);
    }

    public FilaComDuasPilhas() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    void enqueue(String item) {
        enqueueStack.push(item);
    }
     String dequeue() {
        if(dequeueStack.isEmpty()) {
            while(!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        } if (dequeueStack.isEmpty()) {
            return null;
        }
        return dequeueStack.pop();
    }
}
