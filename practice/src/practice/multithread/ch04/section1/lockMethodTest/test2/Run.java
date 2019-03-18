package practice.multithread.ch04.section1.lockMethodTest.test2;

/**
 * @Description 演示getQueueLength()可以获取正在等待此锁的线程数量
 * @Author jefferyqjy
 * @Date 2019/3/18 23:16
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = () -> {
            service.serviceMethod1();
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        System.out.println("有线程数：" + service.lock.getQueueLength() + "在等待获取锁！");
    }
}
