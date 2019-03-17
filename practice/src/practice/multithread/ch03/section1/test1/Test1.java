package practice.multithread.ch03.section1.test1;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/11 11:16
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            String newString = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
