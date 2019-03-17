package practice.multithread.ch03.section4.InheritableThreadLocal1;

import java.util.Date;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/17 20:38
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
