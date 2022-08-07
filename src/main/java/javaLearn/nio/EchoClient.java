//package javaLearn.nio;
//
//import java.io.IOException;
//import java.nio.ByteBuffer;
//import java.nio.channels.SelectionKey;
//import java.util.LinkedList;
//
///**
// * @Author: sunwisepace
// * @CreateTime: 2022-07-29  23:29
// * @Description: TODO
// * @Version: 1.0
// */
//public class EchoClient {
//    private LinkedList<ByteBuffer> outq;
//
//    public EchoClient() {
//        outq = new LinkedList<>();
//    }
//
//    public LinkedList<ByteBuffer> getOutputQueue() {
//        return outq;
//    }
//
//    // 往output queue添加一个ByteBuffer
//    public void enqueue(ByteBuffer bb) {
//        outq.addFirst(bb);
//    }
//}
//
//
//private class HandleMsg implements Runnable {
//
//    private SelectionKey sk;
//    private ByteBuffer bb;
//
//    public HandleMsg(SelectionKey sk, ByteBuffer bb) {
//        this.sk = sk;
//        this.bb = bb;
//    }
//
//    @Override
//    public void run() {
//        // [1] 把附件echoClient取出
//        EchoClient echoClient = (EchoClient) sk.attachment();
//
//        // [2] 将Buffer存储到echoClient中，用于后续的回写操作
//        echoClient.enqueue(bb);
//
//        // [3] 此时，当前Channel已经可以开始回写数据，因此修改感性趣的事件为WRITE
//        sk.interestOps(SelectionKey.OP_READ | SelectionKey.OP_WRITE);
//
//        // [4] 强迫Selector返回，否则会阻塞
////        selector.wakeup();
//    }
//}
//
//    public static void main(String[] args) throws IOException {
//        NIOEchoServer nioEchoServer = new NIOEchoServer();
//        nioEchoServer.startServer();
//    }
//
//}
