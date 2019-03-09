package SizeFive;/**
 * 题目：字符串回文问题
 */


/**
 * 判断一个字符串是不是回文：
 * 方法1：string.charAt(i)==string.charAt(length-i-1)
 * 方法2：放到stringbuilder里，然后执行reverse方法反转，然后再用equals比较两字符串
 * 两种方法都是O(n)
 * 再复杂一点的回文问题，比如最长字串回文问题
 * 方法：动态规划
 * 这里主要实现动态规划的代码
 */
public class String2 {
    public static int parden(String str, int i, int j,int sum) {
        int tmp = 0;
        char[] chars = str.toCharArray();
        if (i == j)
            return sum+1;
        if (i > j)
            return sum;
        if (chars[i] == chars[j])
            return parden(str, i + 1, j - 1,sum+2);
        else
            return Math.max(parden(str, i, j - 1,0), parden(str, i + 1, j,0));
    }

    public static void main(String args[]) {
        String str = "google";
//        System.out.println(str.length());
//        System.out.println( str.toCharArray().length);
        System.out.println(parden(str,0,str.length()-1,0));
    }
}
