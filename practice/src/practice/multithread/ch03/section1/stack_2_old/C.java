package practice.multithread.ch03.section1.stack_2_old;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/14 23:56
 */
public class C {

    private MyStack myStack;

    public C(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop = " + myStack.pop());
    }
}
