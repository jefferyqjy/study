package practice.multithread.ch04.section1.lockInterruptiblyTest1;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 0:55
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final MyService service = new MyService();
        Runnable runnable = () -> {
            service.waitMethod();
        };
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();
        System.out.println("main end!");
    }
}
