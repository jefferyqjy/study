package practice.multithread.ch03.section2.joinTest2;

/**
 * @Description join()方法可以使当前线程进行无限期的阻塞，等待子线程销毁后再继续执行
 * @Author jefferyqjy
 * @Date 2019/3/17 12:26
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join();
            System.out.println("我想当threadTest对象执行完毕后我再执行，我做到了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
