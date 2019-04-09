package leetcode.reverse;

/**
 * 
 * @Description 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * @date 2019年4月9日 上午9:35:46
 */
public class Solution {

	public static void main(String[] args) {
		int number = 1534236469;
		System.out.println(number);
		System.out.println(reverse(number));
	}
	
	/**
	 * 
	 * @Description 解题思路
	 * 1. 如何反转数字，取余，往新的变量的最后加，就是rev * 10 + remainder；
	 * 2. 考虑溢出的情况，可以确定如果结果溢出，那么rev必然>=范围边界 除以 10这个值；
	 * 3. 考虑上面>=的两种情况
	 * 3.1 如果是正数，reverse大于MAX_VALUE/10直接返回0，如果等于MAX_VALUE/10，则尾数>7则认为溢出；
	 * 3.2 如果是负数，reverse小于MIN_VALUE/10直接返回0，如果等于MIN_VALUE/10，则尾数<-8则认为溢出；
	 * @date 2019年4月9日
	 * @param x
	 * @return
	 */
	public static int reverse(int x) {
		int reverse = 0;
		while(x != 0) {
			int remainder = (int) (x % 10);
			x /= 10;
			if(reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && remainder > 7)) {
				return 0;
			}
			
			if(reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && remainder < -8)) {
				return 0;
			}
			
			reverse = reverse * 10 + remainder;	
		}
		
		return reverse;
	}

}