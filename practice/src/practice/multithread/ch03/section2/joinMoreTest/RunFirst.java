package practice.multithread.ch03.section2.joinMoreTest;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 17:52
 */
public class RunFirst {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println(" main end = " + System.currentTimeMillis());
    }
}
