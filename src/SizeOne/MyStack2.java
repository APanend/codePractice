package SizeOne;
/**
 * 如何仅用递归函数和栈操作逆序一个栈
 */

import java.util.Stack;

/**
 *递归：先写退出条件，然后再写主体
 */
public class MyStack2 {
    private Stack<Integer> stack1;

    public MyStack2() {
        this.stack1 = new Stack();
    }

    public Stack<Integer> Reverse(Stack<Integer> stack) {
        if (stack.isEmpty() == true)
            return this.stack1;
        this.stack1.push(stack.pop());
        return Reverse(stack);
    }

    public static void main(String[] args) {
        MyStack2 myStack2 = new MyStack2();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= 5; i++)
            stack.push(i);
        int[] i = new int[2];
        new String("hell").length();
        System.out.println(stack.toString());
        System.out.println(myStack2.Reverse(stack).toString());
    }
}
