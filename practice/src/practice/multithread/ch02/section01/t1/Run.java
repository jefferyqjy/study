package practice.multithread.ch02.section01.t1;

/**
 * 
 * @description 验证方法内部的变量永远是线程安全的 
 * @author jefferyqjy
 *
 */
public class Run {
	
	public static void main(String[] args) {
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		ThreadA thread1 = new ThreadA(numRef);
		thread1.start();
		ThreadB thread2 = new ThreadB(numRef);
		thread2.start();
	}
}
