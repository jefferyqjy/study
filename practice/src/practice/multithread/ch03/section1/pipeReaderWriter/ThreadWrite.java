package practice.multithread.ch03.section1.pipeReaderWriter;

import java.io.PipedWriter;

/**
 * @Description
 * @Author jefferyqjy
 * @Date 2019/3/15 1:31
 */
public class ThreadWrite extends Thread {

    private WriteData write;

    private PipedWriter out;

    public ThreadWrite(WriteData write, PipedWriter out) {
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
