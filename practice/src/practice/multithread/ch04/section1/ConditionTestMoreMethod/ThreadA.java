package practice.multithread.ch04.section1.ConditionTestMoreMethod;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 22:11
 */
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
