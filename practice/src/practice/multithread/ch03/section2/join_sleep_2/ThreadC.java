package practice.multithread.ch03.section2.join_sleep_2;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 17:14
 */
public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
