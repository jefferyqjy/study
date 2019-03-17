package practice.multithread.ch03.section2.join_sleep_1;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 17:09
 */
public class ThreadA extends Thread {

    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                Thread.sleep(6000);
                // Thread.sleep(); // 不释放锁
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
