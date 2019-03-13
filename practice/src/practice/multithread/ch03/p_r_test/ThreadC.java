package practice.multithread.ch03.p_r_test;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/13 17:28
 */
public class ThreadC extends Thread {

    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.getValue();
        }
    }
}
