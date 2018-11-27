package oduoke.star;

import oduoke.config.JedisPoolFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;

@Service("rank")
public class Rank {
    @Autowired
    JedisPoolFactory factory;
    public String get()
    {
        //eturn factory.getJedisPool().getResource().get("STAR_RANK_LIST:STAR_RANKTYPE_DATA:1287464960:3");
        System.out.println(factory);
        //factory = new JedisPoolFactory();
            JedisPool jedisPool = factory.getJedisPool();
            return jedisPool.getResource().get("STAR_RANK_LIST:STAR_RANKTYPE_DATA:1287464960:3");
       // return "ok";
    }
}
