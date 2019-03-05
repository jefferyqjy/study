package practice.multithread.ch02.section03.volatileTestThread;

public class MyThread extends Thread {
	
	volatile public static int count;
	
	/**
	 * 这里注意用synchronized的同时一定要加上static关键字。
	 * 如果不加，创建多个线程对象时，由于synchronized关键字锁的对象，因此这里还是会异步执行；
	 * 如果加上static，则同步的就是MyThread.class这个类，这样对于所有的MyThread对象的addCount()操作就都是同步的，也就是顺序的了。
	 */
	synchronized private static void addCount() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count = " + count);
	}

	@Override
	public void run() {
		addCount();
	}
	
}
