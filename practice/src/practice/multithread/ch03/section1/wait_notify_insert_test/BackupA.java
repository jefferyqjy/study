package practice.multithread.ch03.section1.wait_notify_insert_test;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/15 1:46
 */
public class BackupA extends Thread {

    private DBTools dbTools;


    public BackupA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
