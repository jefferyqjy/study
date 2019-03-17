package practice.multithread.ch03.section2.joinException;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 15:36
 */
public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }
}
