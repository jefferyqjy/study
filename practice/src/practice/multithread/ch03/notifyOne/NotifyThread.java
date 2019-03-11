package practice.multithread.ch03.notifyOne;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/12 0:38
 */
public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            // 一次只会唤醒一个等待的线程；多次唤醒则每次会唤醒一个
//            lock.notify();
            // 唤醒全部的等待线程
            lock.notifyAll();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
        }
    }
}
