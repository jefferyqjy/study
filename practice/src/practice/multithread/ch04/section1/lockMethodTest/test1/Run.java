package practice.multithread.ch04.section1.lockMethodTest.test1;

/**
 * @Description 演示getHoldCount()方法可以获取当前线程调用lock的次数；
 * @Author jefferyqjy
 * @Date 2019/3/18 23:11
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        service.serviceMethod1();
    }
}
