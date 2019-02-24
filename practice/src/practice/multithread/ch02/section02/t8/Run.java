package practice.multithread.ch02.section02.t8;

/**
 * 
 * @description 验证synchronized(this)代码块和synchronized方法，锁定的一样，都是当前对象；
 * 当Task的otherMethod没有加上synchronized关键字的时候，Run的执行结果otherMethod是在中间随机处执行的；
 * 当Task的otherMethod加上synchronized关键字的时候，Run的执行结果一定是在最后，等doLongTimeTask方法执行完成后才执行otherMethod 
 * @author jefferyqjy
 *
 */
public class Run {
	
	public static void main(String[] args) {
		Task task = new Task();
		MyThread1 thread1 = new MyThread1(task);
		thread1.start();
		MyThread2 thread2 = new MyThread2(task);
		thread2.start();
	}

}
