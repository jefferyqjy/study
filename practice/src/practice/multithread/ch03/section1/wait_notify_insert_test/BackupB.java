package practice.multithread.ch03.section1.wait_notify_insert_test;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/15 1:47
 */
public class BackupB extends Thread {

    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
