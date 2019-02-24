package practice.multithread.ch02.section02.synchronizedOneThreadIn;

/**
 * 
 * @description 演示使用了synchronized同步块，但是效率没有太大的提升；
 * @author jefferyqjy
 *
 */
public class Run {
	public static void main(String[] args) {
		ObjectService service = new ObjectService();
		ThreadA thread1 = new ThreadA(service);
		thread1.setName("a");
		thread1.start();
		ThreadB thread2 = new ThreadB(service);
		thread2.setName("b");
		thread2.start();
		// 整个执行过程4秒；
	}
}
