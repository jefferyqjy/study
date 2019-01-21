package java.java8.thread;

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		ThreadA a = new ThreadA();
		a.start();
		//a.sleep(0);
		//a.wait();
		
		System.out.println(System.currentTimeMillis());
		
		//State blocked = Thread.State.BLOCKED;
		
		Thread c = new Thread(new ThreadC());
		c.start();
		c.run();
	}
}
