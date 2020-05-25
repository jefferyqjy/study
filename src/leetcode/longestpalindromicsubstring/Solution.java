package leetcode.longestpalindromicsubstring;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author admin
 * @date 2020/5/21 18:03
 */
public class Solution {

    public static void main(String[] args) {
        String s = "ac";
        System.out.println(longestPalindrome(s));


//        String s = "b";
//        System.out.println(isPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        String substring = "";
        int length = s.length();
        if (length == 1) {
            return s;
        }

        if (length == 2 && s.charAt(0) == s.charAt(1)) {
            return s;
        }

        int left = 0;
        int right = 0;
        for (int i = 0; i < length; i++) {
            left = i;
            right = i;
            char current = s.charAt(i);

            if (left - 1 < 0) {

            }
        }

        return substring;
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }

        int length = s.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        return reverse.equals(s);
    }

//    public static String longestPalindrome(String s) {
//        String substring = "";
//        int length = s.length();
//        if (length == 1) {
//            return s;
//        }
//
//        for (int i = 0; i < length; i++) {
//            char beginChar = s.charAt(i);
//            for (int j = i; j < length; j++) {
//                char endChar = s.charAt(j);
//                if (beginChar == endChar) {
//                    String tmp = s.substring(i, j+1);
//                    boolean palindrome = isPalindrome(tmp);
//                    if (palindrome && tmp.length() > substring.length()) {
//                        substring = tmp;
//                    }
//                }
//            }
//        }
//
//        return substring;
//    }
//
//    public static boolean isPalindrome(String s) {
//        if (s == null || s.length() <= 1) {
//            return true;
//        }
//
//        int length = s.length();
//        String reverse = "";
//        for (int i = length - 1; i >= 0; i--) {
//            reverse = reverse + s.charAt(i);
//        }
//
//        return reverse.equals(s);
//    }
}
