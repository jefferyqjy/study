package algorithm;

public class ValidParenthesesSolution {
	
	private static final char LEFT_BRACKET = '(';
	private static final char RIGHT_BRACKET = ')';
	private static final char LEFT_SQUARE_BRACKET = '[';
	private static final char RIGHT_SQUARE_BRACKET = ']';
	private static final char LEFT_BRACE = '{';
	private static final char RIGHT_BRACE = '}';
	
	public boolean isValid(String s) {
        if(s == null || s.length() == 0 || s.length() % 2 == 1) {
        	return false;
        }

        int length = s.length();
        for(int i = 0; i < length; i++) {
        	char charAt = s.charAt(i);
        	char charNext = 0;
        	if(i < length-1) {
        		charNext = s.charAt(i+1);
        	}
        	char charSymmetry = s.charAt(length-1-i);
        	if(charAt != charSymmetry || charAt != charNext) {
        		return false;
        	}
        	
        	
        }
        
        return false;
    }

}
