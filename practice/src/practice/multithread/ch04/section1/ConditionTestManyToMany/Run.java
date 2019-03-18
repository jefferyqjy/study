package practice.multithread.ch04.section1.ConditionTestManyToMany;

/**
 * @Description 演示使用ReentrantLock和Condition实现交替打印
 * @Author jefferyqjy
 * @Date 2019/3/18 21:14
 */
public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA[] threadA = new MyThreadA[10];
        MyThreadB[] threadB = new MyThreadB[10];
        for (int i = 0; i < 10; i++) {
            threadA[i] = new MyThreadA(service);
            threadB[i] = new MyThreadB(service);
            threadA[i].start();
            threadB[i].start();
        }
    }
}
