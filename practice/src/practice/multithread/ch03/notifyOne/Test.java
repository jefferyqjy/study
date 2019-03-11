package practice.multithread.ch03.notifyOne;

/**
 * @Description 演示了方法notify()仅随机唤醒一个线程；
 * 当多次调用notify()时，会随机将等待wait()状态的线程进行唤醒；
 * 为了保证所有的线程被唤醒，可以使用notifyAll()唤醒所有等待中的线程；
 * @Author jefferyqjy
 * @Date 2019/3/12 0:42
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
        ThreadC c = new ThreadC(lock);
        c.start();
        Thread.sleep(1000);
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
    }
}
