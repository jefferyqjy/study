package practice.multithread.ch03.section3.ThreadLocal11;

/**
 * @Description ThreadLocal解决的是变量在不同线程间的隔离性，也就是不同线程拥有自己的值，不同线程的值是可以放到ThreadLocal中来保存的。
 * @Author jefferyqjy
 * @Date 2019/3/17 18:20
 */
public class Run {

    public static ThreadLocal t1 = new ThreadLocal();

    public static void main(String[] args) {
        if (t1.get() == null) {
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
