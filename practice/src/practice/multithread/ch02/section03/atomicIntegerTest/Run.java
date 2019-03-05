package practice.multithread.ch02.section03.atomicIntegerTest;

/**
 * 验证原子类的原子性，对同一个对象的原子类型的变量进行操作是同步的
 * @author qjy13114
 *
 */
public class Run {

	public static void main(String[] args) {
		AddCountThread countService = new AddCountThread();
		Thread t1 = new Thread(new AddCountThread());
		t1.start();
		Thread t2 = new Thread(countService);
		t2.start();
		Thread t3 = new Thread(countService);
		t3.start();
		Thread t4 = new Thread(countService);
		t4.start();
		Thread t5 = new Thread(countService);
		t5.start();
	}

}
