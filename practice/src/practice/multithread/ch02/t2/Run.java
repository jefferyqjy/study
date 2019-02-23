package practice.multithread.ch02.t2;

/**
 * 
 * @description 验证实例变量为非线程安全的，解决办法是在addI(String username)方法上加synchronized关键字 
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
