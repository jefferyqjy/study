package algorithm;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward. 
 * @Description 
 * @date 2018年11月28日 下午4:16:42
 */
public class PalindromeNumberSolution {
	
	public static boolean isPalindrome(int x) {
		if(x < 0) {
			return false;
		}
		
        long result = 0l;
        int tmp = x;
		while(tmp != 0) {
			result = result*10 + tmp % 10;
			tmp /= 10;
		}
		int y = (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int) result;
		System.out.println("y:" + y);
		System.out.println("x:" + x);
        return x==y;
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}

}
