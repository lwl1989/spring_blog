package oduoke.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPoolConfig;

@Component
public class JedisConfiguration extends JedisPoolConfig {
    @Value("${jedis.port}")
    private Integer port = 3306;
    //注入的值会优先于默认值
    @Value("${jedis.host}")
    private String host = "localhost1";
    @Value("${jedis.max.timeout}")
    private Integer timeout = 3000;

    public JedisConfiguration(){}

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
}


