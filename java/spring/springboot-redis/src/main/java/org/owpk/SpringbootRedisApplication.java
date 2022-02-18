package org.owpk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cache.RedisCacheManagerBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

import java.time.Duration;
import java.util.UUID;

@SpringBootApplication
@EnableRedisRepositories(basePackages = {"org.owpk"})
public class SpringbootRedisApplication implements CommandLineRunner {

    @Autowired
    private SessionRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRedisApplication.class, args);
    }

    @Bean
    public RedisCacheConfiguration cacheConfiguration() {
        return RedisCacheConfiguration.defaultCacheConfig()
                .entryTtl(Duration.ofMinutes(60))
                .disableCachingNullValues()
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));
    }

    @Bean
    public RedisCacheManagerBuilderCustomizer redisCacheManagerBuilderCustomizer() {
        return (builder) -> builder
                .withCacheConfiguration("session",
                        RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(10)));
    }

    @Override
    public void run(String... args) throws Exception {
//        jwt token : userId login roles
        save("12390-sadads4-14124uad", "chrome");
    }

    private void save(String refrTokenUUID, String fingerPrint) {
        var currentSession = new UserSession();
        currentSession.setRefreshTokenUUID(UUID.randomUUID().toString());
        currentSession.setFingerprint(fingerPrint);
        var session = repository.findById(refrTokenUUID).orElse(currentSession);
        if (session.getCount() >= 5)
            throw new RuntimeException("you need to re login");
        if (!session.getFingerprint().equals(fingerPrint))
            session.incrementCount();
        var savedSession = repository.save(session);
        System.out.println(savedSession);
    }
}