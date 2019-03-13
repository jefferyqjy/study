package practice.multithread.ch03.p_c_allWait;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/13 20:06
 */
public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while(true) {
            p.setValue();
        }
    }
}
