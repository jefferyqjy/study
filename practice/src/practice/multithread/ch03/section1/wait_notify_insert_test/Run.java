package practice.multithread.ch03.section1.wait_notify_insert_test;

/**
 * @Description 演示利用volatile关键字、synchronized方法、wait/notify机制来实现A、B两线程交替执行的效果
 * @Author jefferyqjy
 * @Date 2019/3/15 1:45
 */
public class Run {

    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB output = new BackupB(dbTools);
            output.start();
            BackupA input = new BackupA(dbTools);
            input.start();
        }
    }

}
