package com.Fackboos.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

@Configuration
public class RedisConnector {

	@Bean
	public LettuceConnectionFactory redisConnectionFatory(){
		return new LettuceConnectionFactory(new RedisStandaloneConfiguration("192.168.238.133",6379));
		
	} 
}
