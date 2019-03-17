package practice.multithread.ch03.section1.stack_2_old;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/14 23:59
 */
public class Run {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C r1 = new C(myStack);
        C r2 = new C(myStack);
        C r3 = new C(myStack);
        C r4 = new C(myStack);
        C r5 = new C(myStack);
        P_Thread pthread = new P_Thread(p);
        C_Thread rthread1 = new C_Thread(r1);
        C_Thread rthread2 = new C_Thread(r2);
        C_Thread rthread3 = new C_Thread(r3);
        C_Thread rthread4 = new C_Thread(r4);
        C_Thread rthread5= new C_Thread(r5);
        pthread.start();
        rthread1.start();
        rthread2.start();
        rthread3.start();
        rthread4.start();
        rthread5.start();
    }
}
