package leetcode.lrucache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
 *
 * 获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
 * 写入数据 put(key, value) - 如果密钥已经存在，则变更其数据值；如果密钥不存在，则插入该组「密钥/数据值」。当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
 *
 *  
 *
 * 进阶:
 *
 * 你是否可以在 O(1) 时间复杂度内完成这两种操作？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lru-cache
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 
 * @author admin
 * @date 2020/5/25 9:48
 */
public class LRUCache {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        System.out.println("null");
        cache.put(1, 1);
        System.out.println("null");
        cache.put(2, 2);
        System.out.println("null");
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println("null");
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println("null");
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));

    }

    private int capacity = 0;

    private Map<Integer, Integer> map;

    private LinkedList<Integer> lruKeyList;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<Integer, Integer>(capacity);
        this.lruKeyList = new LinkedList<Integer>();
    }

    public int get(int key) {
        if (map == null) {
            return -1;
        }

        if (!map.containsKey(key)) {
            return -1;
        }

        updateLRUKey(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map == null) {
            map = new HashMap<Integer, Integer>(this.capacity);
        }

        if (map.containsKey(key)) {
            // 如果key存在，则更新
            map.put(key, value);
            updateLRUKey(key);
        } else {
            // 如果key不存在，判断capacity是否已满
            if (map.size() >= this.capacity) {
                // capacity已满，找出最少使用的key并删除
                int lruKey = getLRUKey();
                if (lruKey != -1) {
                    map.remove(lruKey);
                }
            }

            updateLRUKey(key);
            map.put(key, value);
        }

    }


    public void updateLRUKey(int key) {
        // 更新lruKeyList中key的使用顺序
        if (lruKeyList == null) {
            lruKeyList = new LinkedList<Integer>();
        }
        if(lruKeyList.contains(key)) {
            lruKeyList.remove(Integer.valueOf(key));
        }

        if (lruKeyList.size() >= this.capacity) {
            lruKeyList.removeFirst();
        }
        lruKeyList.addLast(key);
    }

    public int getLRUKey() {
        if (lruKeyList == null) {
            return -1;
        }

        return lruKeyList.getFirst();
    }
}
