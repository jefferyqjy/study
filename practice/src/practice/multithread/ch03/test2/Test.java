package practice.multithread.ch03.test2;

/**
 * @Description 演示调用notify()方法来唤醒wait状态的线程；
 * @Author qjy13114
 * @Date 2019/3/11 13:51
 */
public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            t1.start();
            Thread.sleep(3000)  ;
            MyThread2 t2 = new MyThread2(lock);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
