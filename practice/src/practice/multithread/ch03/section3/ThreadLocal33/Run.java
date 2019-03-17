package practice.multithread.ch03.section3.ThreadLocal33;

/**
 * @Description 自定义ThreadLocal，验证自定义的初始值及其隔离性
 * @Author jefferyqjy
 * @Date 2019/3/17 20:28
 */
public class Run {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在Main线程中取值 = " + Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}