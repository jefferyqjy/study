package practice.multithread.ch05.section1.part4.timerTest4;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description 凡是带period的都会无限循环执行任务
 * @Author jefferyqjy
 * @Date 2019/3/24 20:32
 */
public class Run {

    static public class MyTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("运行了！时间为： " + new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间：" + new Date());
        timer.schedule(task,3000,5000);
    }
}
