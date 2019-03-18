package practice.multithread.ch04.section1.tryLockTest;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 1:15
 */
public class Run {

    public static void main(String[] args) {
        final MyService service = new MyService();
        Runnable runnable = () -> {
            service.waitMethod();
        };
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
