package practice.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * @Description 
 * @date 2018年11月28日 上午10:52:06
 */
class TwoSumSolution {
	
	public static int[] bestSolution(int[] nums, int target) {
		int[] arr=new int[2048];
        int max = arr.length-1;
        int first = nums[0];
        for(int i = 1; i < nums.length; i++){
            int diff = target-nums[i];
            if(first == diff){
                return new int[]{0, i};
            }
            
            int index = arr[diff & max];
            if(index != 0){
                return new int[]{index, i};
            }
            arr[nums[i] & max]=i;
        }
        return null;
	}
	
	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				return new int[]{i, map.get(nums[i])};
			} else {
				map.put(target - nums[i], i);
			}
		}
		return null;
		
	}
    public static int[] twoSum1(int[] nums, int target) {
        
    	int[] result = new int[2];
        for(int i=0; i<nums.length; i++) {
        	int num =  target - nums[i];
        	for(int j=0; j<nums.length; j++) {
        		if(i != j && num == nums[j]) {
        			result[0] = i;
        			result[1] = j;
        			return result;
        		}
        	}
        }
        return result;
    }
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	int target = Integer.valueOf(str);
    	int[] nums = new int[]{3, 2, 4};
    	int[] twoSum = twoSum(nums, target);
    	if(twoSum != null) {
    		System.out.println(twoSum[0] + ", " + twoSum[1]);
    	}
	}
}
