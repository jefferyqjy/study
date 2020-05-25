package leetcode.subarraysumequalsk;

/**
 * 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
 * 示例 1 :
 *
 * 输入:nums = [1,1,1], k = 2
 * 输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。
 * 说明 :
 *
 * 数组的长度为 [1, 20,000]。
 * 数组中元素的范围是 [-1000, 1000] ，且整数 k 的范围是 [-1e7, 1e7]。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subarray-sum-equals-k
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author admin
 * @date 2020/5/15 9:33
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0,0,0,0,0};
        int k = 0;

        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];

            if (sum == k) {
                count++;
            }

            if (i < nums.length - 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    sum += nums[j];
                    if (sum == k) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
