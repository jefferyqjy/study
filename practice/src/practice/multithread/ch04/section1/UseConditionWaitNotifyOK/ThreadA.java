package practice.multithread.ch04.section1.UseConditionWaitNotifyOK;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 23:30
 */
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
