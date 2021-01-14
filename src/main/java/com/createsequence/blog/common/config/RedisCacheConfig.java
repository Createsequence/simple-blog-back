package com.createsequence.blog.common.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializationContext;

import java.time.Duration;
import java.util.Objects;

/***
 * RedisCacheConfig配置类
 *
 * @author Created by Createsequence on 2021/1/13 12:58
 */
@EnableCaching
@Configuration
public class RedisCacheConfig{

    /**
     * 配置CacheManager
     *
     * @param redisTemplate 在RedisConfig中定义的RedisTemplate
     * @return org.springframework.cache.CacheManager
     * @author Created by Createsequence on 2021/1/13 12:58
     */
    @Bean
    public CacheManager cacheManager(RedisTemplate<String, Object> redisTemplate) {

        // 设置RedisCacheConfiguration
        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
                // 设置key为String
                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(redisTemplate.getStringSerializer()))
                // 设置value 为自动转Json的Object
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(redisTemplate.getValueSerializer()))
                // 不缓存null
                .disableCachingNullValues()
                // 缓存数据保存1小时
                .entryTtl(Duration.ofHours(1));

        // 使用RedisCacheConfiguration创建RedisCacheManager
        return RedisCacheManager.RedisCacheManagerBuilder
                // Redis 连接工厂
                .fromConnectionFactory(Objects.requireNonNull(redisTemplate.getConnectionFactory()))
                // 缓存配置
                .cacheDefaults(redisCacheConfiguration)
                .build();
    }

}
