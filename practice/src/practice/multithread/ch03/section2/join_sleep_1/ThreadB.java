package practice.multithread.ch03.section2.join_sleep_1;

/**
 * @Description ThreadA一直持有ThreadB对象的锁，从执行结果看，可以证明Thread.sleep()方法不释放锁
 * @Author jefferyqjy
 * @Date 2019/3/17 17:10
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("  b run begin time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  b run   end time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService() {
        System.out.println("打印了bService time = " + System.currentTimeMillis());
    }
}
