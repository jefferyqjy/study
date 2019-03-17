package practice.multithread.ch03.section1.waitOld;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/13 0:33
 */
public class Subtract {

    private String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }

    public void subtract() {
        try {
            synchronized (lock) {
                if(ValueObject.list.size() == 0) {
                    System.out.println("begin wait ThreadName = " + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("end wait ThreadName = " + Thread.currentThread().getName());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
