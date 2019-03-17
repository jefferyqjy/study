package practice.multithread.ch03.section1.waitReleaseLock;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/11 16:55
 */
public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
