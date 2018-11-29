package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import oduoke.bean.Star;

public class JsonTest {

    public static void main(String[] args) {
        String json = "{" +
                "    \"sid\": \"1013657184\"," +
                "    \"score\": 23.529819589109," +
                "    \"rank\": 791," +
                "    \"blog_read\": {" +
                "        \"value\": \"1263\"," +
                "        \"rank\": 849," +
                "        \"score\": 8.1863844790063," +
                "        \"gap\": 2," +
                "        \"percent\": \"0.0033452139192788%\"" +
                "    }," +
                "    \"interact\": {" +
                "        \"value\": 10," +
                "        \"repost\": 10," +
                "        \"comment\": 0," +
                "        \"story\": 0," +
                "        \"rank\": 905," +
                "        \"score\": 3.3343328877469," +
                "        \"gap\": 0," +
                "        \"percent\": \"0.0010041501525806%\"" +
                "    }," +
                "    \"mention_search\": {" +
                "        \"value\": 2052," +
                "        \"mention\": \"1862\"," +
                "        \"search\": 190," +
                "        \"rank\": 939," +
                "        \"score\": 7.8684557866274," +
                "        \"gap\": 14," +
                "        \"percent\": \"0.00078217183985224%\"" +
                "    }," +
                "    \"close\": {" +
                "        \"value\": 0," +
                "        \"person_count\": \"0\"," +
                "        \"total_num\": \"0\"," +
                "        \"rank\": 995," +
                "        \"score\": 0," +
                "        \"gap\": 0," +
                "        \"percent\": \"0%\"" +
                "    }," +
                "    \"postive_energy\": {" +
                "        \"active_energy\": {" +
                "            \"value\": 0," +
                "            \"rank\": 1081," +
                "            \"score\": 0," +
                "            \"gap\": 0," +
                "            \"percent\": \"0%\"" +
                "        }," +
                "        \"passive_energy\": {" +
                "            \"value\": 1021," +
                "            \"rank\": 334," +
                "            \"score\": 4.1406464357288," +
                "            \"gap\": 8," +
                "            \"percent\": \"0.0055205497191468%\"" +
                "        }," +
                "        \"score\": 4.1406464357288," +
                "        \"rank\": 335" +
                "    }" +
                "}";

        Object star = JSONObject.parse(json);

        Object s = JSONObject.parse(json);
        System.out.println(s);
        System.out.println(star);

        Star star1 = JSON.parseObject(json, Star.class);
        System.out.println(star1);

        System.out.println(Integer.MAX_VALUE);
    }
}
