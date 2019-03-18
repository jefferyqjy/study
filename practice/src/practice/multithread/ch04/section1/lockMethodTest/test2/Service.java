package practice.multithread.ch04.section1.lockMethodTest.test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/18 23:15
 */
public class Service {

    public ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1(){
        try {
            lock.lock();
            System.out.println("ThreadName = " + Thread.currentThread().getName() + "进入方法！");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
