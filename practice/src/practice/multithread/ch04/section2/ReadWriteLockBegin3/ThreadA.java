package practice.multithread.ch04.section2.ReadWriteLockBegin3;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 22:21
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
