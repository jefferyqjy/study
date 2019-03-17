package practice.multithread.ch03.section1.test2;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/11 13:48
 */
public class MyThread2 extends Thread {

    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始 notify time = " + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束 notify time = " + System.currentTimeMillis());
        }
    }

}
