package practice.multithread.ch02.section02.syn_Out_asyn;

/**
 * 
 * @description A、B两个线程中带有了逻辑判断，这样多次调用同步代码块中的方法，并不能保证两个线程的调用是顺序的，所以打印出来的结果是交叉的，这样就会造成脏读； 
 * @author jefferyqjy
 *
 */
public class Run {
	public static void main(String[] args) {
		MyList list = new MyList();
		MyThreadA a = new MyThreadA(list);
		a.setName("A");
		a.start();
		MyThreadB b = new MyThreadB(list);
		b.setName("B");
		b.start();
	}
}
