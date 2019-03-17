package practice.multithread.ch03.section1.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/15 0:53
 */
public class ReadData {

    public void readMethod(PipedInputStream input) {
        try {
            System.out.println("read : ");
            byte[] byteArray = new byte[20];
            System.out.println("before read length ...");
            int readLength = input.read(byteArray);
            System.out.println("after read length ...");
            while (readLength != -1) {
                String newData = new String(byteArray, 0, readLength);
                System.out.print(newData);
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
