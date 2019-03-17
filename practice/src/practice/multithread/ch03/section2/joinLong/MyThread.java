package practice.multithread.ch03.section2.joinLong;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 15:48
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin time = " + System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
