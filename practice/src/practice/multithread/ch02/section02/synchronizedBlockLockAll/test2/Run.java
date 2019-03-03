package practice.multithread.ch02.section02.synchronizedBlockLockAll.test2;

/**
 * 
 * @description synchronized(x)，验证线程执行x对象中的同步方法，呈同步效果； 
 * @author jefferyqjy
 *
 */
public class Run {
		public static void main(String[] args) throws InterruptedException {
			Service service = new Service();
			MyObject object = new MyObject();
			ThreadA a = new ThreadA(object, service);
			a.setName("a");
			a.start();
			Thread.sleep(100);
			ThreadB b= new ThreadB(object, service);
			b.setName("b");
			b.start();
		}

}
