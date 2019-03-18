package practice.multithread.ch04.section1.awaitUninterruptiblyTest_2;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 1:29
 */
public class MyThread extends Thread {

    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
