package javademo.thread;

public class RunTest {
	
	volatile static ThreadTest test = new ThreadTest();
	
	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getName());
		
//		test.start();
//		System.out.println("运行结束");
		
		try {
			runRandomThreadTest();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void runRandomThreadTest() throws InterruptedException {
		RandomThreadTest thread = new RandomThreadTest();
		thread.setName("myThread");
		thread.start(); // 注意和run方法的区别
		//thread.run();
		for(int i = 0; i < 10; i++) {
			int time = (int) (Math.random() * 1000);
			Thread.sleep(time);
			System.out.println("main=" + Thread.currentThread().getName());
		}
	}
}
