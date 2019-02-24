package practice.multithread.ch02.section02.t7;

/**
 * 
 * @description 验证synchronized代码块中是同步执行的，非synchronized代码块中是异步执行的；
 * 可以看到，在执行结果中，synchronized代码块中顺序执行；非synchronized代码块中的代码就是交叉执行的； 
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
