package SizeOne;
/**
 * 题目：
 */

import java.util.Scanner;
import java.util.Stack;

/**
 *
 */
public class Main {
//    static Stack<Character> stack;

    public static int hello(String words) {
         Stack<Character> stack = new Stack<>();
        char[] chars = words.toCharArray();
        for (char word : chars) {
            if (Character.isSpaceChar(word)) {
                stack.clear();
                continue;
            }
            stack.push(word);
        }
        return stack.size();
    }

    public static void main(String args[]) {
        System.out.println(hello("ABSIB T"));
    }
}
