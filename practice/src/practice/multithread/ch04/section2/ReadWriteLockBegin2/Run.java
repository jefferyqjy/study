package practice.multithread.ch04.section2.ReadWriteLockBegin2;

/**
 * @Description 演示使用写锁，同一时间只有一个线程可以执行
 * @Author jefferyqjy
 * @Date 2019/3/19 22:22
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }

}
