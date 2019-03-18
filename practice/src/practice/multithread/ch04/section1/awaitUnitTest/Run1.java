package practice.multithread.ch04.section1.awaitUnitTest;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 1:37
 */
public class Run1 {
    public static void main(String[] args) {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
    }
}
