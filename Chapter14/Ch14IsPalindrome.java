package Chapter14;

import java.util.*;

public class Ch14IsPalindrome {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(8);
        queue.add(17);
        queue.add(9);
        queue.add(17);
        queue.add(8);
        queue.add(3);

        System.out.print("Apakah " + queue);
        System.out.print(", palindrome? : " + isPalindrome(queue));

        queue.clear();
        System.out.println();

        queue.add(3);
        queue.add(17);
        queue.add(9);
        queue.add(4);
        queue.add(17);
        queue.add(3);

        System.out.print("Apakah " + queue);
        System.out.print(", palindrome? : " + isPalindrome(queue));

    }

    public static boolean isPalindrome (Queue<Integer> queue) {
        Stack<Integer> stackSementara = new Stack<>();
        Queue<Integer> queueSementara = new LinkedList<>(queue);

        for (int i = 0; i < queueSementara.size(); i++) {
            int data = queue.remove();
            stackSementara.add(data);
        }

        queue.addAll(queueSementara);

        for (int i = 0; i < queue.size(); i++) {
            if (!stackSementara.pop().equals(queueSementara.remove())) {
                return false;
            }
        }

        return true;
    }
}
