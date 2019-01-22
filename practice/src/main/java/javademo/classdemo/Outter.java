package javademo.classdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * 
 * @description 
 * @author jefferyqjy
 *
 */
public class Outter {

	static class Inner {
		static int paramOne = 5;
		static final int paramTwo = 5;
		static final int paramThree = new Integer(5);
	}
	
	public static void main(String[] args) {
		/*System.out.println(Outter.Inner.paramOne);
		System.out.println(Outter.Inner.paramTwo);
		System.out.println(Outter.Inner.paramThree);*/
		
		test5();
	}
	
	public static void test(Integer ... i) {
		List<Integer> list = Arrays.asList(i);
		System.out.println(list.size());
	}
	
	public void test2() {
		int j = 0;
		for(int i = 0; i < 100; i++) {
			j = j ++;
		}
		
		System.out.println(j);
	}
	
	public static void test3() {
		ArrayList<String> listOne = new ArrayList<String>();
		listOne.add("this is list");
		Vector<String> vector = new Vector<String>();
		vector.add("this is list");
		System.out.println(listOne.equals(vector));
	}
	
	public static void test4() {
		String s = "1";
		switch(s) {
			case "1":
				System.out.println(111);
		}
	}
	
	public static void test5() {
		byte s1 = 127;
		s1 = (byte) (s1 + 1);
		short s2 = 1;
		s2 += 1;
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
