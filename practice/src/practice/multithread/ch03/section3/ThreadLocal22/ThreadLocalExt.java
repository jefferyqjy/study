package practice.multithread.ch03.section3.ThreadLocal22;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 20:17
 */
public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return "我是默认值 第一次get不再为null";
    }
}
