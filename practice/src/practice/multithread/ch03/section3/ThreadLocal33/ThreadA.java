package practice.multithread.ch03.section3.ThreadLocal33;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 20:23
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA线程中取值 = " + Tools.t1.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
