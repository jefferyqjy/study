package practice.multithread.ch05.section1.part1.taskLater;

import java.util.Date;
import java.util.TimerTask;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 23:29
 */
public class MyTaskA extends TimerTask {
    @Override
    public void run() {
        try {
            System.out.println("A begin timer = " + new Date());
            Thread.sleep(2000);
            System.out.println("A   end timer = " + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
