package Chapter14;

import java.util.*;

public class Ch14RemoveMin {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(8);
        stack.push(3);
        stack.push(19);
        stack.push(7);
        stack.push(3);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(7);
        stack.push(12);
        stack.push(-8);
        stack.push(4);

        System.out.print("Stack " + stack);
        removeMin(stack);
        System.out.println(", setelah dihilangkan min : " + stack);

    }

    public static int removeMin (Stack<Integer> stack) {
        Queue<Integer> queueSementara = new LinkedList<>(stack);

        int min = stack.pop();
        while (!stack.isEmpty()) {
            min = Math.min(min, stack.pop());
        }

        while (!queueSementara.isEmpty()) {
            if (queueSementara.peek() != min) {
                stack.push(queueSementara.remove());
            } else {
                queueSementara.remove();
            }
        }

        return min;
    }
}
