package practice.multithread.ch03.section1.stack_1;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/14 23:59
 */
public class Run {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C r = new C(myStack);
        P_Thread pthread = new P_Thread(p);
        C_Thread rthread = new C_Thread(r);
        pthread.start();
        rthread.start();
    }
}
