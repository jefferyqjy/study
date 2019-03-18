package practice.multithread.ch04.section1.lockMethodTest3.test2;

/**
 * @Description 演示isHeldByCurrentThread()
 * @Author jefferyqjy
 * @Date 2019/3/19 0:39
 */
public class Run {

    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = () -> {
            service1.serviceMethod();
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}