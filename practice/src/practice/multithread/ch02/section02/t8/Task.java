package practice.multithread.ch02.section02.t8;

public class Task {
	synchronized public void otherMethod() {
		System.out.println("------------------------------run--otherMehtod");
	}
	
	public void doLongTimeTask() {
		synchronized(this) {
			for(int i = 0; i < 100; i++) {
				System.out.println("synchronized threadName = " + Thread.currentThread().getName() + " i = " + (i + 1));
			}
		}
	}
}
