package practice.multithread.ch03.section2.joinMoreTest;

/**
 * @Description 此例有多种可能的输出结果，要能够通过结果来推断出大致的执行流程
 * @Author jefferyqjy
 * @Date 2019/3/17 17:45
 */
public class Run1 {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println(" main end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
