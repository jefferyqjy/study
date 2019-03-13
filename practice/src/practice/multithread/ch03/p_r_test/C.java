package practice.multithread.ch03.p_r_test;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/13 17:25
 */
public class C {

    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if(!ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("get的值是 " + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
