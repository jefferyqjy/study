package practice.multithread.ch05.section1.part2.TimerTaskCancelMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/24 19:53
 */
public class MyTaskB extends TimerTask {

    @Override
    public void run() {
        System.out.println("B run timer = " + new Date());
    }
}
