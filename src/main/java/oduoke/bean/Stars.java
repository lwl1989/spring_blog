package oduoke.bean;

import java.math.BigInteger;
import java.util.HashMap;

public class Stars {
    private HashMap<BigInteger,Star> data;
    private String date;

    public HashMap<BigInteger,Star> getData() {
        return data;
    }

    public void setData(HashMap<BigInteger,Star> data) {
        this.data = data;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
