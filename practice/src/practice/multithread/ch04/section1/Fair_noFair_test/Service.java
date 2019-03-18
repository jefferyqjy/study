package practice.multithread.ch04.section1.Fair_noFair_test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/18 22:08
 */
public class Service {

    private ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("ThreadName = " + Thread.currentThread().getName() + "获得锁定");
        } finally {
            lock.unlock();
        }
    }
}
