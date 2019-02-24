package practice.multithread.ch01.sameNum;

public class Run {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		Thread t5 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	
}
