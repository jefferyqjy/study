package practice.multithread.ch04.section1.lockMethodTest3.test1;

/**
 * @Description 演示isFair()
 * @Author jefferyqjy
 * @Date 2019/3/19 0:31
 */
public class Run {

    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = () -> {
            service1.serviceMethod();
        };
        Thread thread = new Thread(runnable);
        thread.start();
        final Service service2 = new Service(false);
        runnable = () -> {
            service2.serviceMethod();
        };
        thread = new Thread(runnable);
        thread.start();
    }
}
