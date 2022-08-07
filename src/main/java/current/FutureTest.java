package current;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executors = Executors.newFixedThreadPool(3);
        Future<String> res = executors.submit(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "abc";
        });

        System.out.println(res.get());
        executors.shutdown();
    }
}
