package practice.multithread.ch03.section3.ThreadLocal33;

import java.util.Date;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 20:22
 */
public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
