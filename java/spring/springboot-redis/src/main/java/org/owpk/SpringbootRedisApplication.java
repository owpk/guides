package org.owpk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@SpringBootApplication
public class SpringbootRedisApplication implements CommandLineRunner {

	@Autowired
	private JedisConnectionFactory jedisConnectionFactory;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRedisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(jedisConnectionFactory.getClientName());
	}
}
