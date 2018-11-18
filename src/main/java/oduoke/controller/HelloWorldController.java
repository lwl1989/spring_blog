package oduoke.controller;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiParam;
import oduoke.emememe.SqlType;
import oduoke.service.FormatSqlBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import oduoke.service.t1;

@RestController
@CrossOrigin
public class HelloWorldController  {
    @Autowired
    t1 t1111;
    @RequestMapping("/hello")
    public String index(
            @RequestBody JSONObject jsonParam
      //      @ApiParam(name = "formatSqlBody") @RequestBody FormatSqlBody formatSqlBody
            ){

    //      return   jsonParam.get("sqlType").toString();
     //   SqlType sqlType = SqlType.get(1);
        return t1111.sqlFormat(jsonParam.get("sql").toString(), SqlType.get(Integer.valueOf(jsonParam.get("sqlType").toString())));
        //return SQLUtils.format(jsonParam.get("sql").toString(),new SqlT, SQLUtils.DEFAULT_FORMAT_OPTION);
       // return sqlType.toString();
    }
}
