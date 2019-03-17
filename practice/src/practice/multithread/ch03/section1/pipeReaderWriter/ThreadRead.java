package practice.multithread.ch03.section1.pipeReaderWriter;

import java.io.PipedReader;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/15 1:32
 */
public class ThreadRead extends Thread {

    private ReadData read;

    private PipedReader input;

    public ThreadRead(ReadData read, PipedReader input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
