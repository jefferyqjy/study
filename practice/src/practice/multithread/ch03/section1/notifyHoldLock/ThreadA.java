package practice.multithread.ch03.section1.notifyHoldLock;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/11 17:45
 */
public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
