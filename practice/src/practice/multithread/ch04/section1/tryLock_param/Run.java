package practice.multithread.ch04.section1.tryLock_param;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 1:23
 */
public class Run {
    public static void main(String[] args) {
        final MyService service = new MyService();
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + "调用waitMethod时间：" + System.currentTimeMillis());
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
