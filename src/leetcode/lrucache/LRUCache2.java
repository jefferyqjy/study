package leetcode.lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 使用LinkedHashMap直接实现的方法
 *
 * @author admin
 * @date 2020/5/25 11:01
 */
public class LRUCache2 extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCache2(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
