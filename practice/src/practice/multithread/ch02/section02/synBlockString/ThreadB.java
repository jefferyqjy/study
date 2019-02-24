package practice.multithread.ch02.section02.synBlockString;

public class ThreadB extends Thread {
	
	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.setUsernamePassword("b", "bb");
	}
	
}
