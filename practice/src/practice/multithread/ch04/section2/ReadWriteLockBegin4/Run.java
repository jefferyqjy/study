package practice.multithread.ch04.section2.ReadWriteLockBegin4;

/**
 * @Description 演示使用读锁和写锁之间是互斥的，当线程已经持有读锁的时候，等待写锁的其他线程必须等待读锁释放；
 * @Author jefferyqjy
 * @Date 2019/3/19 22:22
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(1000);
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
    }

}
