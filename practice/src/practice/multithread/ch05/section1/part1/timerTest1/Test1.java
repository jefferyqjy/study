package practice.multithread.ch05.section1.part1.timerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @Description 演示用Timer指定在未来某个时间执行任务
 * @Author jefferyqjy
 * @Date 2019/3/19 23:04
 */
public class Test1 {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 10);
        Date runDate = calendar.getTime();

        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task, runDate);
    }

}
