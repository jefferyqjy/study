package practice.multithread.ch05.section1.part2.timerTest2_periodLater;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @Description 5.1.2第3点
 * @Author jefferyqjy
 * @Date 2019/3/24 19:48
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("当前时间为： " + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 10);
        Date runDate = calendar.getTime();
        System.out.println("计划时间为： " + runDate);
        MyTaskA task = new MyTaskA();
        Timer timer = new Timer();
        timer.schedule(task, runDate, 3000);

    }
}
