package practice.multithread.ch04.section1.awaitUninterruptiblyTest_2;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 1:30
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread myThread = new MyThread(service);
            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
