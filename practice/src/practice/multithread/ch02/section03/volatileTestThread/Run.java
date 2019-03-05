package practice.multithread.ch02.section03.volatileTestThread;

/**
 * 
 * 验证volatile不具备原子性；
 * 多线程环境下无法保证将变量写入公共堆栈中和从公共堆栈中读取变量这两步操作的同步性；
 * @author qjy13114
 *
 */
public class Run {

	public static void main(String[] args) {
		MyThread[] mythreadArray = new MyThread[100];
		for (int i = 0; i < mythreadArray.length; i++) {
			mythreadArray[i] = new MyThread();
		}
		for (int i = 0; i < mythreadArray.length; i++) {
			mythreadArray[i].start();
		}
	}
}
