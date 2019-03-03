package practice.multithread.ch02.section02.synchronizedBlockLockAll.test1;

public class Service {

	public void testMethod1(MyObject object) {
		try {
			synchronized(object) {
				System.out.println("testMethod1 __getLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("testMethod1 releaseLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
