package redis;


import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class TestRedis {
    public static Jedis redis;

    static {
        redis = new Jedis("81.68.96.221", 6379);
        redis.auth("123456");
    }

//    @Test
//    public void testCon() {
//        String ping = redis.ping();
//        System.out.println(ping);
//
//
//    }

    @Test
    public void testString() {


        redis.set("aaaa", "bbbb");
        display();


    }

    @Test
    public void testList() {


    }

    public void display() {
        Set<String> keys = redis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }


    }

    public void flush() {
        redis.flushDB();
    }


}
