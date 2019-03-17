package practice.multithread.ch03.section2.join_sleep_2;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 17:09
 */
public class ThreadA extends Thread {

    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                b.join();
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
