package practice.multithread.ch03.section4.InheritableThreadLocal1;

/**
 * @Description 验证子线程可以获取到父线程中的值
 * @Author jefferyqjy
 * @Date 2019/3/17 20:40
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
