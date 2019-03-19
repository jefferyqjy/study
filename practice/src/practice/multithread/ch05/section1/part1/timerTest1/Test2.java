package practice.multithread.ch05.section1.part1.timerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 23:08
 */
public class Test2 {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 10);
        Date runDate = calendar.getTime();

        MyTask task = new MyTask();
        Timer timer = new Timer(true); // 守护线程
        timer.schedule(task, runDate);
    }
}
