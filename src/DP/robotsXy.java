package DP;/**
 * 题目：机器人走格子，从左上角(0,0)格子走到右下角(x,y)格子总共有多少种走法，只能向右或者向下走
 */

/**
 * 递归思想复杂度太高，考虑使用动态规划
 * f(x,y) = f(x-1,y)+f(x,y-1)
 */
public class robotsXy {
    public static int hello(int x, int y) {
        int[][] f = new int[x][y];
        f[0][0] = 0;
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++) {
                if(i==0||j==0)
                    f[i][j]=1;
                else {
                    f[i][j] = f[i-1][j]+f[i][j-1];
                }
            }
        return f[x-1][y-1];
    }

    public static void main(String args[]) {
        System.out.println(hello(1,1));
    }
}
