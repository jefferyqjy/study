package practice.multithread.ch02.section02.synBlockString2;

public class ThreadA extends Thread {
	
	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.a();
	}
	
}
