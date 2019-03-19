package practice.multithread.ch05.section1.part1.taskLater;

import java.util.Date;
import java.util.TimerTask;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/19 23:30
 */
public class MyTaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("B begin timer = " + new Date());
        System.out.println("B   end timer = " + new Date());
    }
}
