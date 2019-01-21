package algorithm;

/**
 * Given a 32-bit signed integer, reverse digits of an integer. 
 * @Description 
 * @date 2018年11月28日 下午4:17:11
 */
public class ReverseIntegerSolution {
	
	public static int reverse(int x) {
		Long result = 0l;
		while(x != 0) {
			result = result*10 + x % 10;
			x /= 10;
		}
		return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : result.intValue();
    }
	
	public static void main(String[] args) {
		System.out.println(reverse(123));
	}

}
