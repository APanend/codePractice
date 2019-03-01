package SizeOne;

import java.util.Stack;

/**
 * 实现一个getMin栈，可以返回栈的最小元素
 * */

/**
 * 优化：可以将初始化栈放到构造方法中
 *
 */
public class MyStack1 {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    private int minValue;

    public int pop() {
        if (minStack.isEmpty() == false) {
            minStack.pop();
            return stack.pop();
        } else
            throw new NullPointerException("栈为空");
    }

    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty() == true) {
            minValue = value;
            minStack.push(value);
        } else if (minValue < value) {
            minStack.push(minValue);
        } else
            minStack.push(value);

    }

    public int getMin() {
        if (minStack.isEmpty() == false) {
            return minStack.peek();
        } else
            throw new NullPointerException("栈为空");
    }

    public static void main(String[] args) {

    }
}
