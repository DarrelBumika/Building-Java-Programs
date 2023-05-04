package Chapter14;

import java.util.*;

public class Ch14Interleave {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(2);
        queue.add(8);
        queue.add(-5);
        queue.add(19);
        queue.add(7);
        queue.add(3);
        queue.add(24);
        queue.add(42);

        System.out.print("queue " + queue);
        interleave(queue);
        System.out.print(", hasil : " + queue);
    }

    public static void interleave(Queue<Integer> queue) throws IllegalArgumentException{
        if (queue.size() % 2 == 1) {
            throw new IllegalArgumentException();
        }

        Stack<Integer> stackSementara = new Stack<>();
        int jml = queue.size();

        stackSementara.addAll(queue);
        queue.clear();

        for (int i = 0; i < jml; i++) {
            queue.add(stackSementara.pop());
        }

        stackSementara.addAll(queue);
        queue.clear();

        for (int i = 0; i < jml / 2; i++) {
            queue.add(stackSementara.pop());
        }

        for (int i = 0; i < jml / 2; i++) {
            queue.add(queue.remove());
            queue.add(stackSementara.pop());
        }
    }
}
