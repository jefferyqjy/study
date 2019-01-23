package practice.multithread.t4;

public class MyThread extends Thread {
	
	private int count = 5;
	
	/**
	 * 加锁的这段代码称为互斥区或者临界区
	 */
	@Override
	synchronized public void run() {
		super.run();
		count --;
		System.out.println("由" + currentThread().getName() + "计算，count=" + count);
	}
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread a = new Thread(t, "A");
		Thread b = new Thread(t, "B");
		Thread c = new Thread(t, "C");
		Thread d = new Thread(t, "D");
		Thread e = new Thread(t, "E");
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}

}
