package practice.algorithm.twosum;

/**
 * 
 * @description
 * @author jefferyqjy
 *
 */
public class TwoSumSolution {
	
	public static int[] twoSum(int[] nums, int target) {
		
		int a,b;
		int i = nums.length;
		for(int m = 0; m < i-1; m++) {
			a = nums[m];
			for(int n = m+1; n < i; n++) {
				b = nums[n];
				if(a+b == target) {
					return new int[] {m,n};
				}
			}
		}

		return null;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] result = twoSum(nums, target);
		System.out.println(result[0] + ", " + result[1]);
	}
}
