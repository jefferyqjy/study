package practice.multithread.ch02.section02.synchronizedBlockLockAll.test2;

public class ThreadA extends Thread {
	
	private MyObject object;
	
	private Service service;

	public ThreadA(MyObject object, Service service) {
		super();
		this.object = object;
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.testMethod1(object);
	}
	
}
