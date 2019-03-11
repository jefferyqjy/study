package practice.multithread.ch03.test2;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/11 11:30
 */
public class MyThread1 extends Thread {

    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束wait time= " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
