package SizeEight;
/**
 * 输入描述:
 * 输入多行，先输入随机整数的个数，再输入相应个数的整数
 * 输出描述:
 * 剔除重复数据并大小排序输出。
 *
 * 思考：treeset可以自动过滤重复的元素，直接用lambda表达式输出即可
 */

import java.util.*;

public class Array1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int total = sc.nextInt();
            TreeSet<Integer> ts = new TreeSet<>();
            for (int i = 0; i <= total - 1; i++) {
                ts.add(sc.nextInt());

            }
            ts.forEach((t) -> System.out.println(t));
        }

    }
}