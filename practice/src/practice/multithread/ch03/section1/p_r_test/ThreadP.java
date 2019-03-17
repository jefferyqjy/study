package practice.multithread.ch03.section1.p_r_test;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/13 17:28
 */
public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
