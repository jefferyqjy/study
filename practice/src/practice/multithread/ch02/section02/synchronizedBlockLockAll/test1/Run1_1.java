package practice.multithread.ch02.section02.synchronizedBlockLockAll.test1;

/**
 * 
 * @description 验证多个线程同时执行synchronized(非this对象x)中的代码，呈同步效果（使用了同一个对象监视器） 
 * @author jefferyqjy
 *
 */
public class Run1_1 {
	public static void main(String[] args) {
		Service service = new Service();
		MyObject object = new MyObject();
		ThreadA a = new ThreadA(object, service);
		a.setName("a");
		a.start();
		ThreadB b = new ThreadB(object, service);
		b.setName("b");
		b.start();
	}
}
