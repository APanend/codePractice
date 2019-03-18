package Stringstring;/**
 * 题目：一个字符串删掉多少字符可以变成最长子回文串
 */

import java.util.Scanner;

/**
 * 动态规划，但是提交显示复杂度过高 +。+
 */
public class String3 {
    public static int hello(String str1, String str2, int i, int j, int count) {

        if (i == str1.length() || j == str1.length())
            return count;
        if (str1.charAt(i) == str2.charAt(j)) {
            count++;
            return hello(str1, str2, i + 1, j + 1, count);

        } else {
            return Math.max(hello(str1, str2, i + 1, j, count), hello(str1, str2, i, j + 1, count));
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(3/2);

        while (sc.hasNext()) {
            String s1 = sc.next();
            String sb = new StringBuilder(s1).reverse().toString();
//            System.out.println(s1.length() - hello(s1, sb, 0, 0, 0));
        }
    }
}
