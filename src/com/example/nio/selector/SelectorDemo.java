package com.example.nio.selector;

import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/**
 * @author qiangjunyan
 */
public class SelectorDemo {

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        SocketChannel socketChannel = SocketChannel.open();
        // 与Selector一起使用时，Channel必须处于非阻塞模式下。这意味着不能将FileChannel与Selector一起使用，因为FileChannel不能切换到非阻塞模式。而套接字通道都可以。
        socketChannel.configureBlocking(false);
        SelectionKey key = socketChannel.register(selector, SelectionKey.OP_READ);
        SelectionKey key1 = socketChannel.register(selector, SelectionKey.OP_READ, new Object());

        // channel中感兴趣的事件集合
        int interestSet = key.interestOps();

        // 事件集合中是否存在某一种事件
        boolean isInterestedInAccept = (interestSet & SelectionKey.OP_ACCEPT) == SelectionKey.OP_ACCEPT;
        boolean isInterestedInConnect = (interestSet & SelectionKey.OP_CONNECT) == SelectionKey.OP_CONNECT;
        boolean isInterestedInRead = (interestSet & SelectionKey.OP_READ) == SelectionKey.OP_READ;
        boolean isInterestedInWrite = (interestSet & SelectionKey.OP_WRITE) == SelectionKey.OP_WRITE;

        // 检测channel中什么事件或操作已经就绪
        boolean acceptable = key.isAcceptable();
        boolean connectable = key.isConnectable();
        boolean readable = key.isReadable();
        boolean writable = key.isWritable();

        // 从selectionKey来获取channel和selector
        SelectableChannel channel = key.channel();
        Selector selector1 = key.selector();

        // 附加对象
        key.attach(new Object());
        Object attachment = key.attachment();


    }
}
