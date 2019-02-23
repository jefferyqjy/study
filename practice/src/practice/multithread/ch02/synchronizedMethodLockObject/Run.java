package practice.multithread.ch02.synchronizedMethodLockObject;

/**
 * 
 * @description 多个线程调用同一个对象的同步方法，一定是排队运行的。
 * 注意：需要牢记“共享”两个字，只有共享资源的读写访问才需要同步，如果不是共享资源，则完全没有同步的必要； 
 * @author jefferyqjy
 *
 */
public class Run {
	
	public static void main(String[] args) {
		MyObject object = new MyObject();
		ThreadA threadA = new ThreadA(object);
		threadA.setName("A");
		ThreadB threadB = new ThreadB(object);
		threadB.setName("B");
		threadA.start();
		threadB.start();
	}

}
