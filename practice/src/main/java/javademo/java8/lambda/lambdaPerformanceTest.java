package javademo.java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * lambda表达式学习
 * @author jefferyqjy
 *
 */
public class lambdaPerformanceTest {
	
	private static void normalForeach(List<String> list) {
		for(String str : list) {
			str = str + ",";
		}
	}
	
	private static void lambdaForeach(List<String> list) {
		list.forEach(str -> str += ",");
	}
	
	private static void streamForeach(List<String> list) {
		list.stream().forEach(str -> str += ",");
	}
	
	private static void streamParallelForeach(List<String> list) {
		list.stream().parallel().forEach(str -> str += ",");
	}
	
	/*private static boolean streamTest(List<User> list) {
		return list.stream().allMatch(User::isStudent);
	}*/
	
	@SuppressWarnings("unused")
	private static boolean streamTest(List<User> list) {
		return list.stream().allMatch(User::isStudent);
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		for(long i = 0; i<1000000; i++) {
			list.add(String.valueOf(i));
			list2.add(String.valueOf(i));
			list3.add(String.valueOf(i));
			list4.add(String.valueOf(i));
		}
		
		long before = System.currentTimeMillis();
		normalForeach(list);
		long after = System.currentTimeMillis();
		System.out.println("普通循环100W次所耗时间：" + (after-before));
		
		before = System.currentTimeMillis();
		streamForeach(list2);
		after = System.currentTimeMillis();
		System.out.println("使用stream循环100W次所耗时间：" + (after-before));
		
		before = System.currentTimeMillis();
		lambdaForeach(list3);
		after = System.currentTimeMillis();
		System.out.println("使用forEach+lambda循环100W次所耗时间：" + (after-before));
		
		before = System.currentTimeMillis();
		streamParallelForeach(list4);
		after = System.currentTimeMillis();
		System.out.println("使用stream串行循环100W次所耗时间：" + (after-before));
	}
}
