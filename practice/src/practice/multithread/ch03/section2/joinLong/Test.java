package practice.multithread.ch03.section2.joinLong;

/**
 * @Description 调用子线程的join(long)和调用当前线程的sleep(long)方法，从本例的效果上来看没有区别。
 * 区别在于两个方法的实现，个人理解，join()是使子线程wait()，而sleep()则是当前线程的暂停；
 * @Author jefferyqjy
 * @Date 2019/3/17 15:49
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join(2000); // 只等2秒
//            Thread.sleep(2000);
            System.out.println("  end time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
