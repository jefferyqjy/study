package practice.multithread.ch04.section1.ReentrantLockTest;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 21:42
 */
public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
