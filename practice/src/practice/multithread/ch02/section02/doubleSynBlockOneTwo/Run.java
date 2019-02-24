package practice.multithread.ch02.section02.doubleSynBlockOneTwo;

/**
 * 
 * @description 验证不同方法中的synchronized(this)代码块同样持有的是同一把对象锁；
 * 一个线程在执行synchronized(this)代码块中的代码时，其他线程对于其他方法中的synchronized(this)代码库的访问也是会被阻塞的，这一点和synchronized关键字修饰方法的时候一致； 
 * @author jefferyqjy
 *
 */
public class Run {
	public static void main(String[] args) {
		ObjectService service = new ObjectService();
		ThreadA a = new ThreadA(service);
		a.setName("a");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("b");
		b.start();
	}
}
