package oduoke.star;

import com.alibaba.fastjson.JSON;
import oduoke.bean.Star;
import oduoke.bean.Stars;
import oduoke.config.JedisPoolFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;

import java.util.List;

@Service("rank")
public class Rank {
    @Autowired
    JedisPoolFactory factory;
    public String get()
    {
        return getRedis().getResource().get("str_section_raise_pos_info_v2");
    }

    public List<Star> getRankList(Integer rankType)
    {
        System.out.println( getRedis().getResource().get("STAR_RANK_LIST:YESTERDAY_RANK_LIST:"+rankType.toString()));
        return JSON.parseArray(
                getRedis().getResource().get("STAR_RANK_LIST:YESTERDAY_RANK_LIST:"+rankType.toString()),
                Star.class
        );
       // return s.getStars();
    }

    private JedisPool getRedis()
    {
        return factory.getJedisPool();
    }

    public String getRankKey(Integer rankType)
    {
        return getRedis().getResource().get("STAR_RANK_LIST:YESTERDAY_RANK_LIST:"+rankType.toString());
    }


    public Stars getYesterday(Integer rankType)
    {
        String value = getRankKey(5);
        System.out.println(value);
        Stars stars = JSON.parseObject(value, Stars.class);
        //System.out.println(star);
        return stars;
    }

}
