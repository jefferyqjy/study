package practice.multithread.ch03.section1.notifyHoldLock;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/11 17:42
 */
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() ThreadName = " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait() ThreadName = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin notify() ThreadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
                lock.notify();
                System.out.println("end notify() ThreadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

