package practice.multithread.ch02.section01.synchronizedMethodLockObject2;

public class MyObject {

	synchronized public void methodA() {
		try {
			System.out.println("begin methodA threadName = " + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end endTime = " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void methodB() {
		try {
			System.out.println("begin methodB threadName = " + Thread.currentThread().getName() + " begin time = " + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
