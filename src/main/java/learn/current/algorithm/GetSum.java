package learn.current.algorithm;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class GetSum {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> sub1 = es.submit(() -> {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            return sum;
        });
        Future<Integer> sub2 = es.submit(() -> {
            int sum = 0;
            for (int i = 10; i <= 30; i++) sum += i;
            return sum;
        });
        System.out.println(sub1.get() + sub2.get());
        es.shutdown();


    }

}
