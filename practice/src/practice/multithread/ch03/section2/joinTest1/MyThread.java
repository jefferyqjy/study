package practice.multithread.ch03.section2.joinTest1;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 12:03
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            int secondValue= (int) (Math.random() *10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}