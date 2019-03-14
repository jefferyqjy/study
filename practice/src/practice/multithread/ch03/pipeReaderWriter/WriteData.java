package practice.multithread.ch03.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/15 1:24
 */
public class WriteData {

    public void writeMethod(PipedWriter out) {
        try {
            System.out.println("write: ");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
