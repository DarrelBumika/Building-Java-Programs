package Chapter14;

import java.util.Stack;

public class Ch14Stutter{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(14);
        stack.push(9);

        System.out.println(stack);
        stutter(stack);

        System.out.println(stack);
    }

    public static void stutter(Stack<Integer> stack){
        Stack<Integer> result = new Stack<Integer>();
        for(int data : stack){
            result.push(data);
            result.push(data);
        }

        stack.clear();
        stack.addAll(result);
    }
}