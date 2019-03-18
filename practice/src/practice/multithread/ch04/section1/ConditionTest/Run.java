package practice.multithread.ch04.section1.ConditionTest;

/**
 * @Description 演示使用ReentrantLock和Condition实现交替打印
 * @Author jefferyqjy
 * @Date 2019/3/18 21:14
 */
public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        a.start();
        MyThreadB b = new MyThreadB(service);
        b.start();
    }
}
