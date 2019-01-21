package algorithm;

public class LongestCommonPrefixSolution {
	
	public static String longestCommonPrefix1(String[] strs) {
		if(strs == null || strs.length == 0) {
			return "";
		}
		
		String string = strs[0];
		char[] charArray = string.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			for(int j = 1; j < strs.length; j++) {
				
			}
		}
		return "";
	}
	public static String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0) {
			return "";
		}
		
		String prefix = strs[0];
		for(int i = 0; i < strs.length; i++) {
			if(strs[i].length() < prefix.length()) {
				prefix = strs[i];
			}
		}
		boolean isSame = true;
		do {
			isSame = true;
			for(String str : strs) {
				if(!str.startsWith(prefix)) {
					isSame = false;
					continue;
				}
			}
			if(isSame) {
				return prefix;
			}
			prefix = prefix.substring(0, prefix.length()-1);
		} while(prefix.length() > 0);
		
		return prefix;
		
    }
	
	public static void main(String[] args) {
		String[] array = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(array));
	}


}
