package com.macro.mall.tiny.service;

/**
 * redis操作Service,
 * 对象和数组都以json形式进行存储
 * Created by macro on 2021/3/19.
 * stringRedisTemplate.opsForValue();
 * 操作字符串
 * <p>
 * stringRedisTemplate.opsForHash();
 * 操作hash
 * <p>
 * stringRedisTemplate.opsForList();
 * 操作list
 * <p>
 * stringRedisTemplate.opsForSet();
 * 操作set
 * <p>
 * stringRedisTemplate.opsForZSet();
 * 操作有序set
 */
public interface RedisService {
    /**
     * 存储数据
     */
    void set(String key, String value);

    /**
     * 获取数据
     */
    String get(String key);

    /**
     * 设置超期时间
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     *
     * @param delta 自增步长
     */
    Long increment(String key, long delta);
}
