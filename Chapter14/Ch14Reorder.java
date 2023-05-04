package Chapter14;

import java.util.*;

public class Ch14Reorder {
    public static void main (String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(-2);
        queue.add(4);
        queue.add(-5);
        queue.add(8);
        queue.add(-8);
        queue.add(12);
        queue.add(-15);

        System.out.print("queue " + queue);
        reorder(queue);
        System.out.print(", setelah diurutkan : " + queue);

        queue.clear();
        System.out.println();

        queue.add(9);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(7);
        queue.add(4);

        System.out.print("queue " + queue);
        reorder(queue);
        System.out.print(", setelah diurutkan : " + queue);
    }

    public static void reorder (Queue<Integer> queue) {
        Stack<Integer> stackSementara = new Stack<>();

        int jmlData1 = queue.size();

        for (int i = 0; i < jmlData1; i++) {
            stackSementara.push(queue.remove());

            int jmlData2 = queue.size();
            for (int j = 0; j < jmlData2; j++) {
                if (queue.peek() < stackSementara.peek()) {
                    queue.add(stackSementara.pop());
                    stackSementara.push(queue.remove());
                } else {
                    queue.add(queue.remove());
                }
            }
        }

        queue.addAll(stackSementara);
    }
}
