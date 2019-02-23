package practice.multithread.ch02.t3;

/**
 * 
 * @description 演示出现脏读的情况，解决办法就是在PublicVar.getValue()方法上也同样加上synchronized关键字，保证对实例变量的读写操作可以同步； 
 * @author jefferyqjy
 *
 */
public class Test {
	public static void main(String[] args) {
		try {
			PublicVar publicVar = new PublicVar();
			ThreadA thread = new ThreadA(publicVar);
			thread.start();
			thread.sleep(5000);
			publicVar.getValue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
