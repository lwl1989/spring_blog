package oduoke.service;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import oduoke.emememe.SqlType;

@ApiModel
public class FormatSqlBody {
    @ApiModelProperty(value = "xxx", required = true)
    private String sql;
    @ApiModelProperty(value = "xxx", required = true)
    private SqlType sqlType;
    public FormatSqlBody(){}
    public FormatSqlBody(String sql, SqlType sqlType) {
        this.sql = sql;
        this.sqlType = sqlType;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public SqlType getSqlType() {
        return sqlType;
    }

    public void setSqlType(SqlType sqlType) {
        this.sqlType = sqlType;
    }
}
