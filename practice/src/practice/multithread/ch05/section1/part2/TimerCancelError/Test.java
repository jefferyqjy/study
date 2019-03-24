package practice.multithread.ch05.section1.part2.TimerCancelError;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @Description 5.1.2第6点，演示cancel存在一定几率cancel不掉任务。
 * 这是因为cancel方法内部也是去同步queue对象，当没有争抢到queue锁时，就会让TimerTask类中任务正常执行；
 * @Author jefferyqjy
 * @Date 2019/3/24 20:13
 */
public class Test {

    public static void main(String[] args) {
        int i = 0;
        Calendar calendar = Calendar.getInstance();
        Date runDate1 = calendar.getTime();
        while (true) {
            i++;
            Timer timer = new Timer();
            MyTaskA task1 = new MyTaskA(i);
            timer.schedule(task1, runDate1);
            timer.cancel();
        }
    }
}
