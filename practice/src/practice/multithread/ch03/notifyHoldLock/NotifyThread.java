package practice.multithread.ch03.notifyHoldLock;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/11 17:46
 */
public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
