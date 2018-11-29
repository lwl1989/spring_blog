package oduoke.controller;

import com.alibaba.fastjson.JSON;
import oduoke.star.Rank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class RedisController {
    @Autowired
    Rank t;

    @RequestMapping("/rank")
    public String Test() {
//        List list = t.getRankList(5);
//        return JSON.toJSONString(list);
        return t.getRankKey(5);
    }


    @RequestMapping("/rank1")
    public String Test1() {
        return JSON.toJSONString(t.getYesterday(5));
    }
}
