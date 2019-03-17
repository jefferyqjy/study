package practice.multithread.ch03.section1.waitInterruptException;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/12 0:06
 */
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.printf("begin wait()");
                lock.wait(); // 在同步代码块中，若执行了锁对象的wait()方法，则线程会释放对象锁，并且进入线程等待池中等待被唤醒。
                System.out.println("end wait()");
            }
            // 执行完同步代码块就会释放对象锁；
        } catch (InterruptedException e) {
            // 在执行同步代码块的时候如果遇到了异常，导致线程终止，锁也会被释放；
            e.printStackTrace();
            System.out.println("出现异常了，因为呈wait状态的线程被interrupt了");
        }
    }
}
