package java8.thread;

public class ThreadA extends Thread {
	
	@Override
	public void run() {
		System.out.println("thread a is running...");
		ThreadB b = new ThreadB();
		b.start();
		try {
			b.join(999999999);
		} catch (InterruptedException e) {
			System.out.println("thread b join exception...");
		}
		System.out.println("thread a running over...");
	}

}
