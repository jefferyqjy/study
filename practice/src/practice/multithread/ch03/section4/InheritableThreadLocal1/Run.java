package practice.multithread.ch03.section4.InheritableThreadLocal1;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 20:41
 */
public class Run {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在Main线程中取值 = " + Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA threadA = new ThreadA();
            threadA.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
