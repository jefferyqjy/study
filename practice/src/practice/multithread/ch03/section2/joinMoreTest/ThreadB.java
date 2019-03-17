package practice.multithread.ch03.section2.joinMoreTest;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 17:41
 */
public class ThreadB extends Thread {

    @Override
    synchronized public void run() {
        try {
            System.out.println("begin B ThreadName = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  end B ThreadName = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
