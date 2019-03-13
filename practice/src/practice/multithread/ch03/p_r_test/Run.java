package practice.multithread.ch03.p_r_test;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/13 17:31
 */
public class Run {

    public static void main(String[] args) {
        String lock = "";
        P p = new P(lock);
        C c = new C(lock);
        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);
        threadP.start();
        threadC.start();
    }
}
