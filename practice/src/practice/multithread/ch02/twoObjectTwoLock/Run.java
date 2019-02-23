package practice.multithread.ch02.twoObjectTwoLock;

/**
 * 
 * @description synchronized关键字取得的锁都是对象锁，而不是一段代码或者方法（函数）的锁。
 * 线程执行到带synchronized关键字的方法，线程就获取到这个方法所属类的对象的锁，此时其他线程只能等待，但是这样的前提是多个线程访问的是同一个对象；
 * 当多个线程访问多个对象的时候，jvm会产生多个锁，有几个对象，就会产生几把锁；
 * @author jefferyqjy
 *
 */
public class Run {
	
	public static void main(String[] args) {
		HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
		HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
		ThreadA thread1 = new ThreadA(numRef1);
		thread1.start();
		ThreadB thread2 = new ThreadB(numRef2);
		thread2.start();
	}
}
