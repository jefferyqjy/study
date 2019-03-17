package practice.multithread.ch03.section1.stack_1;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/14 23:53
 */
public class C_Thread extends Thread {

    private C c;

    public C_Thread(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.popService();
        }
    }
}
