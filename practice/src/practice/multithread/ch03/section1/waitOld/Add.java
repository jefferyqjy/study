package practice.multithread.ch03.section1.waitOld;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/13 0:32
 */
public class Add {

    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add(){
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
