package oduoke.service;

import com.alibaba.druid.sql.SQLUtils;
import oduoke.emememe.SqlType;
import org.springframework.stereotype.Service;

@Service("t1")
public class t1 {
    public String sqlFormat(String sql, SqlType sqlType) {
        return "";
        //SqlType sqlType1 = SqlType.get(sqlType);
        //return SQLUtils.format(sql, sqlType1.toString(), SQLUtils.DEFAULT_FORMAT_OPTION);
    }
}
