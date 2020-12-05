package com.powernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class TestJedis {
    public static void main(String[] args) {
        //Jedis jedis = new Jedis("192.168.174.128", 6379);
        JedisPool jedisPool = RedisUtils.open("192.168.174.128", 6379);
        Jedis jedis = jedisPool.getResource();
        jedis.flushDB();
        jedis.set("str","aaa");
        jedis.set("str2","bbb");
        String str1 = jedis.get("str");
        System.out.println(str1);
        jedisPool.close();
    }
}
