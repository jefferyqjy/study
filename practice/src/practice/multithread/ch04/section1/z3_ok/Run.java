package practice.multithread.ch04.section1.z3_ok;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 23:07
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA a = new MyThreadA(myService);
        a.start();
    }
}
