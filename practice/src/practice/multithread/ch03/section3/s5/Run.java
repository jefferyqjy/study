package practice.multithread.ch03.section3.s5;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 20:12
 */
public class Run {

    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB();
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
