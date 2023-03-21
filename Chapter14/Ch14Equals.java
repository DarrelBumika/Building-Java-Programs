package Chapter14;

import java.util.Stack;

public class Ch14Equals{
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        Stack<Integer> stack3 = new Stack<Integer>();

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);

        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);

        stack3.push(1);
        stack3.push(2);
        stack3.push(2);
        stack3.push(4);

        System.out.println("Stack 1 Sebelum : " + stack1);
        System.out.println("Stack 2 Sebelum : " + stack2);
        System.out.println("Stack 3 Sebelum : " + stack3);

        System.out.println();

        System.out.println("Equals.(stack1, stack2) : " + equals(stack1, stack2));
        System.out.println("Equals.(stack1, stack3) : " + equals(stack1, stack3));

        System.out.println();

        System.out.println("Stack 1 Setelah : " + stack1);
        System.out.println("Stack 2 Setelah : " + stack2);
        System.out.println("Stack 3 Setelah : " + stack3);
    }

    public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2){
        Stack<Integer> sementara1 = new Stack<Integer>(), sementara2 = new Stack<Integer>();

        if(stack1.size() != stack2.size()){
            return false;
        }

        sementara1.addAll(stack1);
        sementara2.addAll(stack2);

        while(!sementara1.isEmpty()){
            if(sementara1.pop() != sementara2.pop()){
                return false;
            }
        }

        return true;
    }
}