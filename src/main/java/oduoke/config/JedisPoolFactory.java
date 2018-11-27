package oduoke.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;

@Configuration
public class JedisPoolFactory {
    @Autowired
    private JedisConfiguration jedisConfiguration;
    @Bean
    public JedisPool getJedisPool()
    {
        return new JedisPool(
                jedisConfiguration,
                jedisConfiguration.getHost(),
                jedisConfiguration.getPort(),
                jedisConfiguration.getTimeout()
        );
    }
}
