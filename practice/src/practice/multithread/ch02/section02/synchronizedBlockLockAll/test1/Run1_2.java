package practice.multithread.ch02.section02.synchronizedBlockLockAll.test1;

/**
 * 
 * @description 验证多个线程同时执行synchronized(非this对象x)中的代码，当对象不同，也就是不是同一个对象监视器时，多线程执行操作不同步
 * @author jefferyqjy
 *
 */
public class Run1_2 {
	public static void main(String[] args) {
		Service service = new Service();
		MyObject object1 = new MyObject();
		MyObject object2 = new MyObject();
		ThreadA a = new ThreadA(object1, service);
		a.setName("a");
		a.start();
		ThreadB b = new ThreadB(object2, service);
		b.setName("b");
		b.start();
	}
}
