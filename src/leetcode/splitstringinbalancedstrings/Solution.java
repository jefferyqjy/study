package leetcode.splitstringinbalancedstrings;

/**
 * @Description
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 *
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 *
 * 返回可以通过分割得到的平衡字符串的最大数量。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/split-a-string-in-balanced-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author admin
 * @date 2019/10/17 14:56
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("111");
    }

    public int balancedStringSplit(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // 可以分隔出的平衡字符串数量
        int count = 0;
        // 判断可否截取的标志位
        int num = 1;
        char head = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == head) {
                num++;
            } else {
                num--;
            }
            // 如果num = 0，说明R和L出现次数一样，可截取，count+1；并且将head置为下一个字符
            if (num == 0) {
                count++;
                if (i < s.length()-1) {
                    head = s.charAt(i + 1);
                    num = 0;
                }
            }
        }
        return count;
    }
}
