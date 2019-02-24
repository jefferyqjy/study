package practice.multithread.ch02.section01.throwExceptionNoLock;

/**
 * 
 * @description 演示出现异常后，锁会自动释放，这里如果Service中的异常代码注释掉，那么a线程将永远执行下去，b线程就永远处于等待状态； 
 * @author jefferyqjy
 *
 */
public class Test {
	
	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA a = new ThreadA(service);
			a.setName("a");
			a.start();
			Thread.sleep(500);
			ThreadB b = new ThreadB(service);
			b.setName("b");
			b.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
