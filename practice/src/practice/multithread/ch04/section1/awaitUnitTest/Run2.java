package practice.multithread.ch04.section1.awaitUnitTest;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 1:41
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
        Thread.sleep(2000);
        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.start();
    }
}
