package org.owpk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootRedisApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRedisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//		System.out.println(save());
	}

	@GetMapping
	private Student save() {
		var stud = new Student("Aboba", Student.Gender.FEMALE, 10);
		return  repository.save(stud);
	}
}
