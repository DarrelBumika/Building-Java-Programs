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
        System.out.println(queue);

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
        System.out.println(queue);

    }

    public static boolean isPalindrome (Queue<Integer> queue) {
        Stack<Integer> stackSementara = new Stack<>();
        boolean hasil = true;

        int jmlData = queue.size();
        for (int i = 0; i < jmlData / 2; i++) {
            int data = queue.remove();
            queue.add(data);
            stackSementara.add(data);
        }

        if(jmlData % 2 == 1) {
            queue.add(queue.remove());
        }

        for (int i = 0; i < jmlData / 2; i++) {
            int a = stackSementara.pop();
            int b = queue.remove();
            if (a != b) {
                hasil = false;
                queue.add(b);
            } else {
                queue.add(a);
            }
        }

        return hasil;
    }
}
