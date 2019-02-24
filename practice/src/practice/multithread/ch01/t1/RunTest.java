package practice.multithread.ch01.t1;

public class RunTest {
	
	public static void main(String[] args) throws InterruptedException {
//		runRandomThreadTest();
		runThreadTest();
	}
	
	public static void runRunnableTest() {
		RunnableTest run = new RunnableTest();
		Thread t = new Thread(run, "runnable-");
		t.start();
	}

	public static void runThreadTest() {
		ThreadTest t1 = new ThreadTest(1);
		ThreadTest t2 = new ThreadTest(2);
		ThreadTest t3 = new ThreadTest(3);
		ThreadTest t4 = new ThreadTest(4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
	public static void runRandomThreadTest() throws InterruptedException {
		RandomThreadTest thread = new RandomThreadTest();
		thread.setName("myThread");
		thread.start(); // 注意和run方法的区别
		thread.run();
		for(int i = 0; i < 10; i++) {
			int time = (int) (Math.random() * 1000);
			Thread.sleep(time);
			System.out.println("main=" + Thread.currentThread().getName());
		}
	}
}
