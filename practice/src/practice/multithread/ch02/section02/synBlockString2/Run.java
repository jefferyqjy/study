package practice.multithread.ch02.section02.synBlockString2;

/**
 * 
 * @description 演示，由于对象监视器不同，也就是synchronized()的不是同一个对象，造成异步执行代码； 
 * @author jefferyqjy
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
