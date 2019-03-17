package practice.multithread.ch03.section1.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/11 14:24
 */
public class MyList {

    private static List list = new ArrayList();

    public static void add() {
        list.add("anyString");
    }

    public static int size() {
        return list.size();
    }
}
