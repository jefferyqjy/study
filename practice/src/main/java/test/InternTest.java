package test;

public class InternTest {
	
	public static void main(String[] args) {
		
		//String sss = "计算机软件";
		
		/*String str = new StringBuilder("计算机").append("软件").toString();
		String intern = str.intern();
		System.out.println(intern == str);
		
		String str1 = new StringBuilder("ja").append("va").toString();
		System.out.println(str1.intern() == str1);*/
		for(int i = 0; i < 100; i++) {
			String s = new String("abc");
		}
	}

}
