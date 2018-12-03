package practice.algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @description 
 * 给定四个数字，返回这四个数字所能排出的最大时间（24小时制），即最大23:59，最小00:00，
 * 以"HH:mm"的字符串形式返回，若不能排出范围内的时间则返回空字符串 
 * @author jefferyqjy
 *
 */
public class LargestTimeFromDigitsSolution {
	
	public static String largestTimeFromDigits(int[] A) {
		
		if(A == null || A.length != 4) {
			return "";
		}
		
		for(int i = 0; i<A.length; i++) {
			if(A[i] > 9 || A[i] < 0) {
				return "";
			}
		}
		
		Set<Integer[]> set = new HashSet<Integer[]>();
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A.length; j++) {
				if(i != j) {
					int hour = A[i]*10 + A[j];
					if(hour < 24) {
						set.add(new Integer[] {i,j});
					}
				}
			}
		}
		
		Map<Integer, String>map = new HashMap<Integer, String>();
		for(Integer[] array : set) {
			int a = array[0]; // 索引
			int b = array[1]; // 索引
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < A.length; i++) {
				if(i != a && i != b) {
					list.add(i);
				}
			}
			int c = list.get(0); //索引
			int d = list.get(1); // 索引
			
			int hour = A[a] * 10 + A[b];
			int time1 = A[c] * 10 + A[d];
			int time2 = A[d] * 10 + A[c];
			List<Integer> tmp = new ArrayList<Integer>();
			tmp.add(time1);
			tmp.add(time2);
			Integer time = tmp.stream().sorted(Comparator.reverseOrder()).filter(item -> item < 60).findFirst().orElse(null);
			if(time != null) {
				String hourstr = "" + A[a] + A[b];
				String timestr = "";
				if(time == time1) {
					timestr = "" + A[c] + A[d];
				}
				if(time == time2) {
					timestr = "" + A[d] + A[c];
				}
				map.put(hour * 100 + time, hourstr + ":" + timestr);
			}
		}
		
		if(map.size() > 0) {
			Integer key = map.keySet().stream().sorted(Comparator.reverseOrder()).findFirst().get();
			return map.get(key);
		}
		
		return "";
	}
	
	public static void main(String[] args) {
		int[] a = {2, 0, 6, 6};
//		int[] b = {0, 0, 0, 0};
//		int[] c = {2, 0, 8, 8};
//		int[] d = {9, 9, 9, 9};
//		int[] e = {2, 5, 9, 3};
//		int[] f = {2, 0, 6, 6};
//		int[] g = {2, 0, 6, 6};
		System.out.println(largestTimeFromDigits(a));
	}

}
