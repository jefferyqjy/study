package practice.multithread.ch04.section1.MustUseMoreConditionOK;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/18 0:02
 */
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}
