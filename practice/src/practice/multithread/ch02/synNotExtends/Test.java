package practice.multithread.ch02.synNotExtends;

/**
 * 
 * @description 验证同步不能继承，如果想要在子类中依旧获得同步效果，必须在子类的方法上也同样加上synchronized关键字 
 * @author jefferyqjy
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Sub subRef = new Sub();
		MyThreadA a = new MyThreadA(subRef);
		a.setName("a");
		a.start();
		MyThreadB b = new MyThreadB(subRef);
		b.setName("B");
		b.start();
	}
}
