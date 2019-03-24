package practice.multithread.ch05.section1.part2.TimerCancelError;

import java.util.TimerTask;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/24 20:11
 */
public class MyTaskA extends TimerTask {

    private int i;

    public MyTaskA(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("第 " + i + "次没有被cancel取消");
    }
}
