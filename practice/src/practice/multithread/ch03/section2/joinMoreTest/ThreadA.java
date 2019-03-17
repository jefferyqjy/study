package practice.multithread.ch03.section2.joinMoreTest;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 17:41
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
                System.out.println("begin A ThreadName = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("  end A ThreadName = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
