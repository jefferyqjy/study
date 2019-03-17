package practice.multithread.ch03.section1.p_c_allWait;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/13 20:07
 */
public class ThreadC extends Thread {

    private C r;

    public ThreadC(C r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.getValue();
        }
    }
}
