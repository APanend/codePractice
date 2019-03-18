package Stackstack;
/**
 * 题目：
 */

import java.util.*;

/**
 *
 */

public class Main {
    static Stack<Character> stack;

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
        List<Iterator>list1 = new ArrayList<>();
        String name = "dsf";
        String hello = "dds";
        hello.intern();
        Iterator it = list1.iterator();
        Object num;
        if(it.hasNext()){
            num = it.next();
        }
        char[] chars1 = new char[2];
        String str = chars1.toString();
        char[] ca = str.toCharArray();
        int numm = str.charAt(2);
//        int munn2 = Integer.parseInt(str);
//        str = String.valueOf(munn2);
        Vector<Integer> vector = new Vector<>();
        Vector<Integer> vector1 = (Vector<Integer>) vector.clone();
//        String str2 = str.clone();
        double a=2.12;
        long b = (long) a;
        HashMap map2 = new HashMap();
        map2.put(2,2);
        Map<Integer,Integer> map = new HashMap<>();
        Iterator iterator = map.keySet().iterator();
        if(name.equals(hello)){
            System.out.println(name);
        }
//        switch (a){
//
//        }
        return stack.size();
    }

    public static void main(String args[]) {
        System.out.println(hello("ABSIB T"));
    }
}
