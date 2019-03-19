package practice.multithread.ch05.section1.part1.taskLater;

import practice.multithread.ch05.section1.part1.timerTest2.MyTask;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @Description timer中是以队列形式，排队执行的
 * @Author jefferyqjy
 * @Date 2019/3/19 23:30
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendar1 = Calendar.getInstance();
        Date runDate1 = calendar1.getTime();
        System.out.println("A计划时间为：" + runDate1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.SECOND, 10);
        Date runDate2 = calendar2.getTime();
        System.out.println("B计划时间为：" + runDate2);

        MyTaskA task1 = new MyTaskA();
        MyTaskB task2 = new MyTaskB();

        Timer timer = new Timer();
        timer.schedule(task1, runDate1);
        timer.schedule(task2, runDate2);
    }
}
