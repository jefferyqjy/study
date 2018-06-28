package designpattern.singleton;


/** 
 * @Description 双重检查锁
 * lazy loading: true
 * thread safe: true
 * @date 2018年6月27日 下午3:06:54 
 */
public class SingletonTestD {
	
	private static SingletonTestD singleton;
	
	private SingletonTestD() {}

	public static SingletonTestD getSingleton() {
		if(singleton == null) {
			synchronized(SingletonTestD.class) {
				singleton = new SingletonTestD();
			}
		}
		return singleton;
	}
}
