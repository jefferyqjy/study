package practice.multithread.ch03.section2.joinTest1;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 12:06
 */
public class Test {
    public static void main(String[] args) {
        MyThread threadTest = new MyThread();
        threadTest.start();
        System.out.println("我想当threadTest对象执行完毕后我再执行");
        System.out.println("但上面代码中的sleep()中的值应该写多少呢？");
        System.out.println("答案是：不能确定:)");
    }
}
