package practice.multithread.ch02.section03.atomicIntegerNoSafe;

/**
 * 这个例子演示了虽然原子类可以保证对变量操作的原子性，但是在方法没有同步的情况下，方法和方法之间的调用不是原子的，还是有可能出现不同步的情况；
 * 解决这个问题的办法就是将对原子类的变量进行操作的这个方法也用synchronized关键字修饰；
 * @author qjy13114
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			MyService service = new MyService();
			MyThread[] array = new MyThread[5];
			for (int i = 0; i < array.length; i++) {
				array[i] = new MyThread(service);
			}
			for (int i = 0; i < array.length; i++) {
				array[i].start();
			}
			Thread.sleep(1000);
			System.out.println(MyService.aiRef.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
