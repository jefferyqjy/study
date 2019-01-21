package designpattern.singleton;


/** 
 * @Description 懒汉（线程不安全）
 * lazy loading: true
 * thread safe: false
 * @date 2018年6月27日 下午3:06:54 
 */
public class SingletonTestA {
	
	private static SingletonTestA singleton;
	
	private SingletonTestA() {}

	public static SingletonTestA getSingleton() {
		if(singleton == null) {
			singleton = new SingletonTestA();
		}
		return singleton;
	}
}
