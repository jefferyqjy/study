package com.example.nio.filechanneldemo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author qiangjunyan
 * @date 2019-07-13
 */
public class FileChannelDemo {

    public static void main(String[] args) throws IOException {
        RandomAccessFile accessFile = new RandomAccessFile("c://documents/FileChannelDemo.txt", "rwd");
        FileChannel fileChannel = accessFile.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(48);

        int read = fileChannel.read(buffer);
        while (read != -1) {
            System.out.println("Read " + read);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
            buffer.clear();
            read = fileChannel.read(buffer);
        }

        accessFile.close();
    }
}
