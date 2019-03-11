package practice.multithread.ch03.notifyOne;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/12 0:38
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
