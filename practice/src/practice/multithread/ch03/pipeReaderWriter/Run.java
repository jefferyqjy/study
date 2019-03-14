package practice.multithread.ch03.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/15 1:36
 */
public class Run {

    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData= new ReadData();

            PipedReader inputStream = new PipedReader();
            PipedWriter outStream = new PipedWriter();

            //inputStream.connect(outStream);
            outStream.connect(inputStream);

            ThreadRead threadRead = new ThreadRead(readData, inputStream);
            threadRead.start();

            Thread.sleep(2000);

            ThreadWrite threadWrite = new ThreadWrite(writeData, outStream);
            threadWrite.start();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
