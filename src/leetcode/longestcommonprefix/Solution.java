package leetcode.longestcommonprefix;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 
 * @Description 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
 * 说明: 所有输入只包含小写字母 a-z 。
 * @date 2019年4月11日 上午9:24:30
 */
public class Solution {
	
	public static void main(String[] args) {
		String[] strs = {"flower", "flow", "flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0) {
			return "";
		}
		
		// 最小长度
		int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
        	if(strs[i].length() < minLength) {
        		minLength = strs[i].length();
        	}
		}
        
        HashSet<Character> set = new HashSet<Character>(); // 用来判断同一位的字符是否相同
        char[] array = new char[]{}; // 存放相同的前缀的字符
        for(int i = 0; i < minLength; i++) {
        	for (String str : strs) {
				set.add(str.charAt(i));
			}
        	if(set.size() == 1) {
        		array = Arrays.copyOf(array, array.length + 1);
        		array[i] = set.iterator().next();
        		set.clear();
        	} else {
        		break;
        	}
        }
        return new String(array);
    }

}
