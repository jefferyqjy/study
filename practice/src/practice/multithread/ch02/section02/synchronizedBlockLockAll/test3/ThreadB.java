package practice.multithread.ch02.section02.synchronizedBlockLockAll.test3;

public class ThreadB extends Thread {
	
	private MyObject object;
	
	private Service service;

	public ThreadB(MyObject object, Service service) {
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
