package practice.multithread.ch02.section02.doubleSynBlockOneTwo;

public class ThreadB extends Thread {
		
	private ObjectService service;

	public ThreadB(ObjectService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.serviceMethodB();
	}
	
}
