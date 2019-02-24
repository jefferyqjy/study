package practice.multithread.ch02.section01.synchronizedMethodLockObject2;

/**
 * 
 * @description 分别对MyObject的方法methodB加上和去掉synchronized关键字，可以看到执行结果不同，得出以下结论：
 * 1. 对于没有加同步的methodB，在main方法的执行过程中，A线程先持有object对象的锁，但是B线程可以异步调用object对象中的非同步方法；
 * 2. 对于加上synchronized关键字的methodB，main方法在执行过程中，A线程先持有object对象的锁，
 * B线程此时调用object对象中的另一个同步方法methodB，由于锁是对象级别的，因此两个线程在竞争的实际上是同一把锁，所以B线程需要等待，也就是同步； 
 * @author jefferyqjy
 *
 */
public class Run {
	
	public static void main(String[] args) {
		MyObject object = new MyObject();
		ThreadA threadA = new ThreadA(object);
		threadA.setName("A");
		ThreadB threadB = new ThreadB(object);
		threadB.setName("B");
		threadA.start();
		threadB.start();
	}

}
