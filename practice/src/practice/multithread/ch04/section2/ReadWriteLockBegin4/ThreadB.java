package practice.multithread.ch04.section2.ReadWriteLockBegin4;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 22:21
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
