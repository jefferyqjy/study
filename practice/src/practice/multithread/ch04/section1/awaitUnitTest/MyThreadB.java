package practice.multithread.ch04.section1.awaitUnitTest;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 1:39
 */
public class MyThreadB extends Thread {

    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
