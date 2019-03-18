package practice.multithread.ch04.section1.Fair_noFair_test;

/**
 * @Description 非公平锁的演示
 * @Author jefferyqjy
 * @Date 2019/3/18 22:16
 */
public class RunNotFair {
    public static void main(String[] args) {
        final Service service = new Service(false);
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
