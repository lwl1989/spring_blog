package oduoke.controller;

import com.alibaba.fastjson.JSON;
import oduoke.bean.User;
import oduoke.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    UserDao u;
    @RequestMapping("/user")
    public String index(

            //@ApiParam(name = "formatSqlBody") @RequestBody FormatSqlBody formatSqlBody
    ){
        //return t.get();
        //      return   jsonParam.get("sqlType").toString();
        //   SqlType sqlType = SqlType.get(1);
        User user = u.selectCityById(1);

        if(null == user) {
            return "error";
        }

        return JSON.toJSONString(user);
        //return SQLUtils.format(jsonParam.get("sql").toString(),new SqlT, SQLUtils.DEFAULT_FORMAT_OPTION);
        // return sqlType.toString();
    }

}
