package practice.multithread.ch04.section1.Fair_noFair_test;

/**
 * @Description 公平锁的演示
 * @Author jefferyqjy
 * @Date 2019/3/18 22:11
 */
public class RunFair {

    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = () -> {
            System.out.println("★线程" + Thread.currentThread().getName() + "运行了");
            service.serviceMethod();
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
