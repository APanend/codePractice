package SizeFive;/**
 * 题目：写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 */
public class String1 {

    public static int hello(String words, char char_) {
        HashMap<Character, Integer> map = new HashMap<>();  //求频率，考虑用map存储
        char[] chars = words.toLowerCase().toCharArray();  //统一大小写规范
        for (char _char : chars)
            if (_char == char_) {
                if (map.get(_char) == null)                   //考虑到初次命中，直接put
                    map.put(_char, 1);
                else
                    map.put(_char, map.get(_char) + 1);
            }
        if (map.containsKey(char_))     //考虑到零命中情况直接get会得到null
            return map.get(char_);
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(hello(sc.next(), sc.next().charAt(0)));
        sc.close();   //外层流关闭会自动关闭内层流
    }
}