package practice.multithread.ch03.section2.join_sleep_2;

/**
 * @Description 在A线程中使用join()而不是sleep，从执行结果上看，可以知道join()执行以后A释放了b的对象锁
 * @Author jefferyqjy
 * @Date 2019/3/17 17:15
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
