package practice.multithread.ch04.section1.ConditionTestManyToMany;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/18 21:13
 */
public class MyThreadA extends Thread {

    private MyService myService;

    public MyThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.set();
        }
    }
}
