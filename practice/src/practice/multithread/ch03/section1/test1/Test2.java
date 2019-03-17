package practice.multithread.ch03.section1.test1;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/11 11:27
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("syn start");
            synchronized (lock) {
                System.out.println("sync first line");
                lock.wait();
                System.out.println("wait end");
            }
            System.out.println("sync end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
