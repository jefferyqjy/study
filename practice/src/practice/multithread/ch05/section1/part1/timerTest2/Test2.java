package practice.multithread.ch05.section1.part1.timerTest2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 23:24
 */
public class Test2 {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendar1 = Calendar.getInstance();
        calendar1.add(Calendar.SECOND, 10);
        Date runDate1 = calendar1.getTime();
        System.out.println("计划时间为：" + runDate1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.SECOND, 15);
        Date runDate2 = calendar2.getTime();
        System.out.println("计划时间为：" + runDate2);

        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();

        Timer timer = new Timer();
        timer.schedule(task1, runDate1);
        timer.schedule(task2, runDate2);
    }
}
