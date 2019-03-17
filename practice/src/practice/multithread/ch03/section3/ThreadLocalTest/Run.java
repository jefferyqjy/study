package practice.multithread.ch03.section3.ThreadLocalTest;

/**
 * @Description 验证了数据的隔离性
 * @Author jefferyqjy
 * @Date 2019/3/17 18:26
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("Main " + (i + 1));
                System.out.println("Main get value = " + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
