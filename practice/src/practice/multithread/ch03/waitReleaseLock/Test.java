package practice.multithread.ch03.waitReleaseLock;

/**
 * @Description 演示wait()不仅能使线程进入Blocked状态，还会释放锁；
 * 而sleep()不会，sleep也会使线程进入Blocked状态，但是并不会释放锁，在代码结果中可以看到，使用了sleep()还是同步执行的；
 * @Author qjy13114
 * @Date 2019/3/11 16:58
 */
public class Test {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
    }
}
