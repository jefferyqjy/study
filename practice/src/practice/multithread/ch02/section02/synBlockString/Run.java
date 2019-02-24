package practice.multithread.ch02.section02.synBlockString;

/**
 * 
 * @description 演示synchronized(非this对象)锁，与synchronized同步方法以及synchronized(this)代码块不争抢同一把锁；
 * 同时，验证了synchronized(非this对象)进行同步操作时，对象监视器必须是同一个对象，如果不是同一个对象，就是异步调用了；
 * 从代码中来看，Service中的synchronized，如果anyString是在实例变量，那么同步就是有效的；
 * 加入把anyString放到方法内部，那这个同步就无效了；
 * @author jefferyqjy
 *
 */
public class Run {
	
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("a");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("b");
		b.start();
	}

}
