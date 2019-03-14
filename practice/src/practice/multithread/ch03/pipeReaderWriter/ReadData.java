package practice.multithread.ch03.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/15 1:27
 */
public class ReadData {

    public void readMethod(PipedReader input) {
        try {
            System.out.println("read: ");
            char[] byteArray = new char[20];
            int readLength = input.read(byteArray);
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
