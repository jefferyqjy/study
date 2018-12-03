package practice.java8.lambda;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * lambda表达式学习
 * @author jefferyqjy
 *
 */
public class lambdaTest {
	
	/**
	 * lambda表达式用法一：替代匿名内部类
	 * 
	 * 这个功能在很多地方应该都可以用到，比如集合的比较、排序等等，可以很有效的简化代码
	 */
	public static void oldRunnable() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("old runnable is running...");
			}
		}).start();
	}
	
	public static void newRunnable() {
		new Thread(() -> System.out.println("new runnable is running...")).start();
	}
	
	/**
	 * 用法二：使用lambda表达式对集合进行迭代
	 */
	public static void testList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.forEach(x -> System.out.println(x));
	}
	
	public static void testUser() {
		User user1 = new User();
		user1.setUserNmae("a");
		
		User user2 = new User();
		user2.setUserNmae("a");
		
		User user3 = new User();
		user3.setUserNmae("a");
		
		List<User> userlist = new ArrayList<User>();
		userlist.add(user1);
		userlist.add(user2);
		userlist.add(user3);
		
		Consumer<User> c = user -> setCommonUser(user);
		userlist.forEach(c.andThen(user -> printUser(user)));
	}
	
	public static void setCommonUser(User user) {
		user.setCreateTime(new Date());
		user.setCreateUser("mockeduser");
	}
	
	public static void printUser(User user) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = user.getCreateTime();
		System.out.print(user.getUserNmae() + " : " + df.format(date) + ", " + user.getCreateUser());
		System.out.println();
	}
	
	/**
	 * 用法三：lambda表示式实现map
	 * 
	 * map可以将一个对象变为另一个对象；
	 * 在实际开发中，应该比较对一个集合中所有的对象做相同操作这样的行为，比如将所有用户的性别改为男等等。
	 */
	public static void testMap() {
		User user1 = new User();
		user1.setUserNmae("a");
		user1.setId("111");
		
		User user2 = new User();
		user2.setUserNmae("a");
		user2.setId("222");
		
		User user3 = new User();
		user3.setUserNmae("a");
		
		List<User> userlist = new ArrayList<User>();
		userlist.add(user1);
		userlist.add(user2);
		userlist.add(user3);
		
		userlist.forEach(user -> user.setCreateTime(new Date()));
		userlist.stream().map(user -> user.getCreateTime()).forEach(x -> System.out.print(x + "  "));
	}
	
	/**
	 * 用法四：lambda表达式实现map和reduce
	 * 
	 * map上面说过是把一个对象转成另外一个对象，reduce是将值合并；
	 * 在实际中可能比较多会用于数值的计算，比如对集合中的数值统一做某项处理后求和或者差等等。
	 */
	public static void testReducer() {
		List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
        double allCost = cost.stream().map(x -> x+x*0.05).reduce((sum,x) -> sum + x).get();
        System.out.println(allCost);
	}
	
	/**
	 * 用法五：filter操作
	 * 
	 * 从集合中过滤一部分不符合条件的数据；
	 * 这个功能应该会很有用，比如获取用户的集合并从中过滤掉非本地的用户等等类似的过滤功能，会很方便
	 * 
	 * 用法六：与Predict配合使用
	 * 
	 * 这个用法和用法五应该会经常配合使用，过滤条件可以拎出来写成Predict来做复用
	 */
	public static void filterTest() {
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0,40.0);
        // 这里还可以把x -> filter(x)这里提出来写成一个Predicate，以作复用
        List<Double> filteredCost = cost.stream().filter(x -> filter(x)).collect(Collectors.toList());
        filteredCost.forEach(x -> System.out.println(x));
    }
	
	public static boolean filter(Double d) {
		if(d >= 20 && d <= 30) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		//oldRunnable();
		//newRunnable();
		//testList();
		//testUser();
		//testMap();
		//testReducer();
		filterTest();
	}
}
