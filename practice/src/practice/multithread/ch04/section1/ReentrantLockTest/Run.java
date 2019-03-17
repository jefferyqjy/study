package practice.multithread.ch04.section1.ReentrantLockTest;

/**
 * @Description 演示ReentrancLock可以保证线程内上锁的部分同步执行，但是不能保证线程顺序执行
 * @Author jefferyqjy
 * @Date 2019/3/17 21:45
 */
public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread a1 = new MyThread(service);
        MyThread a2 = new MyThread(service);
        MyThread a3 = new MyThread(service);
        MyThread a4 = new MyThread(service);
        MyThread a5 = new MyThread(service);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
