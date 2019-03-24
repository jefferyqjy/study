package practice.multithread.ch05.section1.part2.TimerTaskCancelMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @Description 5.1.2第4点，演示计划任务自己将自己从任务队列中移除
 * @Author jefferyqjy
 * @Date 2019/3/24 19:54
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("当前时间为： " + new Date());
        Calendar calendar = Calendar.getInstance();
        Date runDate1 = calendar.getTime();
        System.out.println("计划时间为： " + runDate1);
        MyTaskA task1 = new MyTaskA();
        MyTaskB task2 = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(task1, runDate1, 4000);
        timer.schedule(task2, runDate1, 4000);
    }
}
