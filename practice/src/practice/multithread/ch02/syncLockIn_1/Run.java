package practice.multithread.ch02.syncLockIn_1;

/**
 * 
 * @description 演示了可重入锁
 * 可重入锁：自己可以再次获得自己的内部锁，比如有一条线程获取了对象锁，此时这个对象的锁还没有被释放，此线程中想要获取这个对象的锁还是可以拿到的，如果不可重入的话就会造成死锁
 * 自己的理解：一个线程获取了对象锁，就可以访问这个对象中所有的同步方法了，不需要等待； 
 * @author jefferyqjy
 *
 */
public class Run {
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
