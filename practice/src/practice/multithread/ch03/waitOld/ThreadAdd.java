package practice.multithread.ch03.waitOld;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/13 0:35
 */
public class ThreadAdd extends Thread {

    private Add p;

    public ThreadAdd(Add p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
