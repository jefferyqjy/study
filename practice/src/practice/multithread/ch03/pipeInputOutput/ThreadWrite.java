package practice.multithread.ch03.pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/15 0:57
 */
public class ThreadWrite extends Thread {

    private WriteData write;

    private PipedOutputStream out;

    public ThreadWrite(WriteData write, PipedOutputStream out) {
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
