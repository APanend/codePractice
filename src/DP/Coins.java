package DP;/**
 * 题目：现在有三枚硬币，2，5，7元无数枚，想要将27元兑换成最少数量的硬币
 */

/**
 * 不可以用贪心，7*3+5*1+1*1=27，但是并没有一元硬币。如果7*3+22*3 = 27，但方案并不是最优的
 * 考虑动态规划：
 * 假设整体事件为f(27),且一定有一枚k元（2或5或7）的硬币，则f(27) = f(27-k) + 1；其中k有三种情况，且取三种情况的最小值
 */
public class Coins {
    public static int DP(int n) {
        int[] f = new int[n + 1];
        f[0] = 0;

        for (int i = 1; i < n + 1; i++) {
            f[i] = 100;
            if (i >= 7)
                f[i] = Math.min(f[i - 2] + 1, Math.min(f[i - 5] + 1, f[i - 7] + 1));
            else if (i >= 5) {
                f[i] = Math.min(f[i - 2] + 1, f[i - 5] + 1);
            } else if (i >= 2) {
                f[i] = f[i - 2] + 1;
            }
        }
        return f[n];
    }

    public static void main(String args[]) {
        System.out.println(DP(27));
    }
}
