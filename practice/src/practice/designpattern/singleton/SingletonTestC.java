package practice.designpattern.singleton;


/** 
 * @Description 懒汉
 * lazy loading: true
 * thread safe: true
 * @date 2018年6月27日 下午3:06:54 
 */
public class SingletonTestC {
	
	private static SingletonTestC singleton;
	
	private SingletonTestC() {}

	public static synchronized SingletonTestC getSingleton() {
		if(singleton == null) {
			singleton = new SingletonTestC();
		}
		return singleton;
	}
}
