package practice.multithread.ch04.section1.lockMethodTest.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/18 23:23
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod() {
        try {
            lock.lock();
            System.out.println("有" + lock.getWaitQueueLength(condition) + "个线程正在等待condition");
            condition.signal();
            System.out.println("有" + lock.getWaitQueueLength(condition) + "个线程正在等待condition");
        } finally {
            lock.unlock();
        }
    }
}
