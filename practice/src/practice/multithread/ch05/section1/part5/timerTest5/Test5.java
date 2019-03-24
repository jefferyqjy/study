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
public class Test5 {

    static class MyTask extends TimerTask {

        @Override
        public void run() {
            try {
                System.out.println("begin timer = " + System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println("  end timer = " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, date,3000);
    }
}
