package practice.multithread.ch03.section1.stack_1;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/14 23:53
 */
public class P {

    private MyStack myStack;

    public P(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
