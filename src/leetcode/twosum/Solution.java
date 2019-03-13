package leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @Description 两数之和，给定一个int类型的数组和一个目标值，找出数组中和等于目标值的两个数字的下标； 
 * 注意点：只认为数组中只有一对满足目标值的数字并且相同数字不能重复使用（比如目标值为10，数组第一位为5，则结果不能为[0,0]）；
 * @date 2019年3月13日 上午10:48:31
 */
public class Solution {
	
	public static void main(String[] args) {
		int[] nums = new int[]{2, 11, 15, 7};
		int target = 9;
		int[] twoSum = twoSum5(nums, target);
		if(twoSum != null) {
			System.out.println(twoSum[0] + ", " + twoSum[1]);
		} else {
			System.out.println("null");
		}
	}

	/**
	 * 
	 * @Description 最简单的做法  
	 * @date 2019年3月13日
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < length; i++) {
            map.put(i, nums[i]);
        }
        
        for(int i = 0; i < length; i++) {
            int num1 = map.get(i);
            for(int j = 0; j < length; j++) {
                if(i != j) {
                    int num2 = map.get(j);
                    if(num1 + num2 == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
		return null;
    }
	
	/**
	 * 
	 * @Description 进阶1，把map拿掉；
	 * @date 2019年3月13日
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum1(int[] nums, int target) {
		int length = nums.length;
		
        for(int i = 0; i < length; i++) {
            int num1 = nums[i];
            for(int j = 0; j < length; j++) {
                if(i != j) {
                    int num2 = nums[j];
                    if(num1 + num2 == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
		return null;
	}
	
	/**
	 * 
	 * @Description 进阶2，提出变量，减少每次for循环都新建变量
	 * @date 2019年3月13日
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum2(int[] nums, int target) {
		int length = nums.length;
		
		int num1, num2;
		for(int i = 0; i < length; i++) {
			num1 = nums[i];
			for(int j = 0; j < length; j++) {
				if(i != j) {
					num2 = nums[j];
					if(num1 + num2 == target) {
						return new int[]{i, j};
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @Description 进阶3， 减少第二次for循环的数量
	 * @author qjy@chebada.com 
	 * @date 2019年3月13日
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum3(int[] nums, int target) {
		int length = nums.length;
		
		int num1, num2;
		for(int i = 0; i < length; i++) {
			num1 = nums[i];
			for(int j = i+1; j < length; j++) { // i+1，减少第二次for循环的次数
				if(i != j) {
					num2 = nums[j];
					if(num1 + num2 == target) {
						return new int[]{i, j};
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @Description 进阶4，上面的几种做法的时间复杂度都是O(n²)，利用哈希表，以空间换时间
	 * @date 2019年3月13日
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum4(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for(int i = 0; i < nums.length; i++) {
			int num2 = target - nums[i];
			if(map.containsKey(num2) && map.get(num2) != i){
				return new int[]{i, map.get(num2)};
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @Description 进阶5，上面已经想到用map，哈希了，这里更进一步，用一遍哈希
	 * ** 实际测试下来，进阶5和进阶4其实没多大差别，甚至进阶5的执行用时和内存消耗还稍稍高于进阶4，但是基本上可以忽略不计了
	 * @date 2019年3月13日
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum5(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			int num2 = target - nums[i];
			if(map.containsKey(num2)){
				return new int[]{i, map.get(num2)};
			}
			map.put(nums[i], i);
		}
		return null;
	}
	
	
	
}
