package practice.multithread.ch05.section1.part5.timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/24 20:43
 */
public class Test10 {

    static class MyTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("begin timer = " + new Date());
            System.out.println("  end timer = " + new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        System.out.println("现在执行时间： " + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 20);
        Date date = calendar.getTime();
        System.out.println("计划执行时间： " + date);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, date, 2000);
    }
}
