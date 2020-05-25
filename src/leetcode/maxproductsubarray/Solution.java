package leetcode.maxproductsubarray;

/**
 * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 * 示例 2:
 * <p>
 * 输入: [-2,0,-1]
 * 输出: 0
 * 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-product-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author admin
 * @date 2020/5/18 9:58
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {

        int sum = 1;
        Integer max = null;
        for (int i = 0; i < nums.length; i++) {
            sum *= nums[i];
            if (max == null) {
                max = sum;
            } else {
                if (max.intValue() < sum) {
                    max = sum;
                }
            }

            if (i < nums.length - 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    sum *= nums[j];
                    if (max.intValue() < sum) {
                        max = sum;
                    }
                }
            }
            sum = 1;
        }

        return max.intValue();
    }
}
