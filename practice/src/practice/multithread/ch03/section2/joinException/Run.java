package practice.multithread.ch03.section2.joinException;

/**
 * @Description join()与interrupt()方法相互遇到会抛出InterruptedException;
 * 比如当在线程X中有一个子线程调用了join()，这时候如果对线程X执行interrupt()方法，则会报错。
 * 同时，需要说明的是，线程X中开启的子线程是不受影响，还会继续执行的。
 * @Author jefferyqjy
 * @Date 2019/3/17 15:37
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
