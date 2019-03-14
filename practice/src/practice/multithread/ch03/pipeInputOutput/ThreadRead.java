package practice.multithread.ch03.pipeInputOutput;

import java.io.PipedInputStream;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/15 0:59
 */
public class ThreadRead extends Thread {

    private ReadData read;

    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
