package practice.multithread.ch05.section1.part1.timerTest2;

import java.util.Date;
import java.util.TimerTask;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 23:17
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行了，时间为：" + new Date());
    }
}
