package practice.multithread.ch04.section1.lockMethodTest2.test1;

/**
 * @Description 演示hasQueueThread方法
 * @Author jefferyqjy
 * @Date 2019/3/18 23:39
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = () -> {
            service.waitMethod();
        };
        Thread a = new Thread(runnable);
        a.start();
        Thread.sleep(500);
        Thread b = new Thread(runnable);
        b.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(a)); // 指定线程是否在等待此锁定
        System.out.println(service.lock.hasQueuedThread(b)); // 指定线程是否在等待此锁定
        System.out.println(service.lock.hasQueuedThreads()); // 是否有线程在等待获取此锁定
    }
}
