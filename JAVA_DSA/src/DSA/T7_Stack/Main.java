package DSA.T7_Stack;

// import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        DynamicStack stack = new DynamicStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        // stack.displayStack();
        // System.out.println(stack);
        // System.out.println(stack.pop());
        // System.out.println(stack);
    }
}
