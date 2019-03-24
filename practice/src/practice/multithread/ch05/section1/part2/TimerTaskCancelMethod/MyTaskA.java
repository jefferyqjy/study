package practice.multithread.ch05.section1.part2.TimerTaskCancelMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/24 19:52
 */
public class MyTaskA extends TimerTask {

    @Override
    public void run() {
        System.out.println("A run timer = " + new Date());
        this.cancel();
        System.out.println("A 任务自己移除自己");
    }
}
