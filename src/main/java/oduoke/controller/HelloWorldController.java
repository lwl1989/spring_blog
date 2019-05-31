package oduoke.controller;

import com.alibaba.fastjson.JSONObject;
import oduoke.emememe.SqlType;
import oduoke.star.Rank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import oduoke.service.t1;

@RestController
@CrossOrigin
public class HelloWorldController  {
    //注入要从控制器开始注入，如果控制器不是注入的，底层的类也就算写了AutoWired，也无法自动注入
    //应该有方法可以让其注入，待下次研究
    @Autowired
    Rank t;
    @Autowired
    t1 t1111;
    @RequestMapping("/hello")
    public String index(
           @RequestBody JSONObject jsonParam
           //@ApiParam(name = "formatSqlBody") @RequestBody FormatSqlBody formatSqlBody
            ){
        //return t.get();
    //      return   jsonParam.get("sqlType").toString();
     //   SqlType sqlType = SqlType.get(1);
        return t1111.sqlFormat(jsonParam.get("sql").toString(), SqlType.get(Integer.valueOf(jsonParam.get("sqlType").toString())));
        //return SQLUtils.format(jsonParam.get("sql").toString(),new SqlT, SQLUtils.DEFAULT_FORMAT_OPTION);
       // return sqlType.toString();
    }

    @RequestMapping("/redis")
    public String redis() {
        return t.get();
    }
}
