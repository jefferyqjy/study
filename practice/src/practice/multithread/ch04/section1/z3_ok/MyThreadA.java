package practice.multithread.ch04.section1.z3_ok;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 23:07
 */
public class MyThreadA extends Thread {

    private MyService myService;

    public MyThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.waitMethod();
    }
}
