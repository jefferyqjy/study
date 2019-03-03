package practice.multithread.ch02.section02.synchronizedBlockLockAll.test3;

/**
 * 
 * @description 验证当其他线程执行x对象方法里面的synchronized(this)代码块时也呈现同步效果；
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
