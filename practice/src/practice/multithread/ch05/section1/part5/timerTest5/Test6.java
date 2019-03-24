package practice.multithread.ch05.section1.part5.timerTest5;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/24 20:43
 */
public class Test6 {

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
        System.out.println("当前时间： " + System.currentTimeMillis());
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, 3000, 4000);
    }
}
