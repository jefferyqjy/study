package practice.multithread.ch03.waitOld;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/13 0:37
 */
public class ThreadSubtract extends Thread {

    private Subtract r;

    public ThreadSubtract(Subtract r) {
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}
