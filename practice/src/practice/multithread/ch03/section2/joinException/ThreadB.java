package practice.multithread.ch03.section2.joinException;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 15:34
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B在run end处打印了");
        } catch (InterruptedException e) {
            System.out.println("线程B处打印了");
            e.printStackTrace();
        }
    }
}
