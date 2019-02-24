package practice.multithread.ch02.section02.t9;

/**
 * 
 * @description 验证脏读的出现，以及在给对象上锁之后解决脏读的问题； 
 * @author jefferyqjy
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyOneList list = new MyOneList();
		MyThread1 thread1 = new MyThread1(list);
		thread1.setName("A");
		thread1.start();
		MyThread2 thread2 = new MyThread2(list);
		thread2.setName("B");
		thread2.start();
		Thread.sleep(6000);
		System.out.println("listSize = " + list.getSize());
	}
}
