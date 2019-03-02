package SizeOne;
import java.util.Stack;
import java.util.Scanner;/**
 * 题目：求字符串最后一个单词的长度
 */

/**
 *思考：找准数据结构来存储，空间换时间
 */
public class MyStack3{
    public static int hello(String words){
        Stack<Character> stack = new Stack();
        char[] chars = words.toCharArray();
        for(char _char : chars){
            if(Character.isSpaceChar(_char)){
                stack.clear();
                continue;
            }
            stack.push(_char);
        }
        return stack.size();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(hello(sc.nextLine()));
    }
}
