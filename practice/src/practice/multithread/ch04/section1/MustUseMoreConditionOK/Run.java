package practice.multithread.ch04.section1.MustUseMoreConditionOK;

/**
 * @Description 演示通过同一个lock的多个condition给线程分组，可以实现唤醒指定线程的功能
 * @Author jefferyqjy
 * @Date 2019/3/18 0:03
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        service.signalAll_A();
    }
}
