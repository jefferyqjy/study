package practice.multithread.ch04.section1.lockMethodTest.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/18 23:09
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1(){
        try {
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount = " + lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
        }
    }

    public void serviceMethod2() {
        try {
            lock.lock();
            System.out.println("serviceMethod2 getHoldCount = " + lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }
}
