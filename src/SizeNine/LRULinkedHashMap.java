package SizeNine;/**
 * 题目：java实现LRU存储算法
 */


import java.util.LinkedHashMap;
import java.util.Map;

/**
 *思路：采用带参linkedhashmap构造函数，重写removeEldestEntry方法
 */
public class LRULinkedHashMap<K,V> extends LinkedHashMap<K,V> {
    private int initsize;
    public LRULinkedHashMap(int initsize){
        super(initsize,0.75f,true);
        this.initsize = initsize;
    }
    //采用带餐构造函数，每次put前都会先执行该方法
    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){

        return size()>initsize;
    }
    public static void main(String args[]) {

    }
}
