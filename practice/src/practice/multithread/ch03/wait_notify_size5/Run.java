package practice.multithread.ch03.wait_notify_size5;

/**
 * @Description 演示两个线程对同一个对象的访问。
 * 并且验证了notify后，当前持有对象锁的线程并不会马上释放锁，而是会等线程执行完成之后再释放锁；
 * 同样的也可以理解，wait状态下的线程也不会马上获得锁，需要等之前的线程释放锁以后才能重新获得锁；
 * @Author qjy13114
 * @Date 2019/3/11 14:30
 */
public class Run {

    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
