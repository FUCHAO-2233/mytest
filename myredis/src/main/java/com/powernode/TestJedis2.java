package com.powernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class TestJedis2 {
    public static void main(String[] args) {
        JedisPool jedisPool = RedisUtils.open("192.168.174.128", 6379);
        Jedis jedis = jedisPool.getResource();
    }
}
