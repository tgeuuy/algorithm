package current;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class CallableDemo {

    public static Logger log = LoggerFactory.getLogger(CallableDemo.class);
    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) {

        //使用阿里巴巴推荐的创建线程池的方式
        //通过ThreadPoolExecutor构造函数自定义参数创建
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy());

        List<Future<String>> futureList = new ArrayList<>();
        Callable<String> callable = new MyCallable();
        for (int i = 0; i < 10; i++) {
            //提交任务到线程池
            Future<String> future = executor.submit(callable);
            //将返回值 future 添加到 list，我们可以通过 future 获得 执行 Callable 得到的返回值
            futureList.add(future);
        }
        for (Future<String> fut : futureList) {
            try {
                System.out.println(new Date() + "::" + fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //关闭线程池
        executor.shutdown();
    }
//
//    /**
//     * 打印线程池的状态
//     *
//     * @param threadPool 线程池对象
//     */
//    public static void printThreadPoolStatus(ThreadPoolExecutor threadPool) {
//        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(1, createThreadFactory("print-images/thread-pool-status", false));
//        scheduledExecutorService.scheduleAtFixedRate(() -> {
//            log.info("=========================");
//            log.info("ThreadPool Size: [{}]", threadPool.getPoolSize());
//            log.info("Active Threads: {}", threadPool.getActiveCount());
//            log.info("Number of Tasks : {}", threadPool.getCompletedTaskCount());
//            log.info("Number of Tasks in Queue: {}", threadPool.getQueue().size());
//            log.info("=========================");
//        }, 0, 1, TimeUnit.SECONDS);
//    }
}
