package practice.multithread.ch04.section1.lockMethodTest2.test2;

/**
 * @Description 演示hasWaiters(condition)的用法；
 * @Author jefferyqjy
 * @Date 2019/3/18 23:47
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = () -> {
            service.waitMethod();
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
    }
}
