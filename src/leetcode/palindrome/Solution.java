package leetcode.palindrome;

/**
 * 
 * @Description 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。（如果有符号的话，符号也需要考虑进去）
 * @author qjy@chebada.com 
 * @date 2019年4月10日 上午10:01:15
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(0));
	}
	
	public static boolean isPalindrome(int x) {
		if(x < 0) {
			return false;
		}
		
		if(x < 10) {
			return true;
		}
		
		if(x % 10 == 0) {
			return false;
		}
		
		int rev = 0;
		int y = x;
		while(y != 0) {
			int pop = y % 10;
			rev = rev * 10 + pop;
			y /= 10;
		}
		
		if(rev == x) {
			return true;
		}
		
		return false;
    }

}
