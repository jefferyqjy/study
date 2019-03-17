package practice.multithread.ch04.section1.UseConditionWaitNotifyOK;

/**
 * @Description 演示await()和signal()的使用
 * @Author jefferyqjy
 * @Date 2019/3/17 23:30
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}
