package practice.multithread.ch03.notifyHoldLock;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/11 17:48
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        SynNotifyMethodThread synNotifyMethodThread = new SynNotifyMethodThread(lock);
        synNotifyMethodThread.start();
    }
}
