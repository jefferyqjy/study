package practice.multithread.ch03.section1.waitReleaseLock;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/11 16:53
 */
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + "begin wait()");
//                lock.wait();
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + "end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
