package oduoke.emememe;

import com.alibaba.druid.util.StringUtils;

public enum  SqlType {
    ODPS(1, "ODPS"),
    HIVE(2, "HIVE"),
    MYSQL(3, "MYSQL"),
    ORACLE(4, "ORACLE");

    private int value;
    private String text;

    SqlType(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public static SqlType get(int value) {
        for (SqlType sqlType : values()) {
            if(sqlType.getValue() == value) {
                return sqlType;
            }
        }
        throw new IllegalArgumentException("啥啥啥");
    }

    public static SqlType get(String text) {
        for (SqlType sqlType : values()) {
            if(StringUtils.equalsIgnoreCase(sqlType.getText(), text)) {
                return sqlType;
            }
//            if(sqlType.getText().equals(text)) {
//                return sqlType;
//            }
        }
        throw new IllegalArgumentException("啥啥啥");
    }

    public String getText() {
        return text;
    }

    public int getValue() {
        return value;
    }

//    @Override
//    public String toString() {
//        return "SqlType{" +
//                "value=" + value +
//                ", text='" + text + '\'' +
//                '}';
//    }
}
