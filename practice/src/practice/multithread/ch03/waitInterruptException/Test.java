package practice.multithread.ch03.waitInterruptException;

/**
 * @Description 演示了同步代码块释放对象锁的几种情况：
 * 1：执行完同步代码块后会自动释放对象的锁；
 * 2：执行同步代码块时遇到了异常导致线程终止时会释放对象锁；
 * 3：执行同步代码块时，如果调用了同步对象的wait()方法，这个线程会释放对象锁，线程会进入等待池中，等待被唤醒；
 * @Author jefferyqjy
 * @Date 2019/3/12 0:14
 */
public class Test {

    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(5000);
            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
