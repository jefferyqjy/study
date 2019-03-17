package practice.multithread.ch03.section2.joinException;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 15:33
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
            System.out.println("线程A执行了：" + i);
        }
    }
}
