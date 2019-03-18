package Stringstring;/**
 * 题目：模式串匹配：ps为模式串，ts为主串
 * 暴力方法：遇到不匹配i指针回到原位
 * 双指针：无法解决回文模式串
 * KMP：善于解决特殊的模式串，如含有回文字串的模式串
 * BM:需要构造好字串集合，数据量小的话使用Horspool算法更优
 * Horspool：简单版的BM
 */

/**
 * Horspool实现
 */
public class Horspool {
    public static int hello() {
        char[] smain = "babcdabcdabd".toCharArray();  //主串
        char[] sprep = "abd".toCharArray();   //模式串
        int leng1 = smain.length;
        int leng2 = sprep.length;
        int j = leng2 - 1;
        int step = 0;
        //特殊情况
        if(sprep.length==0){

        }
        //正常情况
        for (int i = j; i < leng1 && i >= -1; ) {
            if (j == -1) {
                return i + 1;
            }
            if (sprep[j] == smain[i]) {
                j--;
                i--;
                continue;
            }
            if (sprep[j] != smain[i]) {
                for (int m = j; m >= 0 && m < leng2; m--) {
                    if (sprep[m] == smain[i]) {
                        step = j - m;
                        break;
                    } else {
                        step = leng2;
                    }

                }
                i += step;
                j = leng2 - 1;
                step = 0;
            }
        }
        return Integer.MAX_VALUE;  //表示没有符合要求的串
    }

    public static void main(String args[]) {
        System.out.println(hello());
    }
}
