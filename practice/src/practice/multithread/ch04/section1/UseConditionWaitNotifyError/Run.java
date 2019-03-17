package practice.multithread.ch04.section1.UseConditionWaitNotifyError;

/**
 * @Description condition.await()必须在获得对象监视器之后才能调用，否则会抛出监视器的异常
 * @Author jefferyqjy
 * @Date 2019/3/17 22:59
 */
public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }

}
