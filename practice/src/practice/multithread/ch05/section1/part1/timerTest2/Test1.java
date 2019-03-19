package practice.multithread.ch05.section1.part1.timerTest2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @Description 如果执行任务的时间早于当前时间，则立即执行task任务
 * @Author jefferyqjy
 * @Date 2019/3/19 23:18
 */
public class Test1 {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 10);
        Date runDate = calendar.getTime();
        System.out.println("计划时间为：" + runDate);
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task, runDate);
    }
}
