package designpattern.singleton;


/** 
 * @Description 饿汉
 * lazy loading：false
 * thread safe: true
 * @date 2018年6月27日 下午3:06:54 
 */
public class SingletonTestB {
	
	private static SingletonTestB singleton = new SingletonTestB();
	
	private SingletonTestB() {}

	public static SingletonTestB getSingleton() {
		return singleton;
	}
}
