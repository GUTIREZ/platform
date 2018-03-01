package test;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: sunxuelong.
 * @Cretion Date: 2018-02-28.
 * @Description: .
 */

public class CoreTest {
    public String t1(){
        TestObj user = new TestObj();
        user.setName("guti");
        user.setPassword("123");

        return JSONObject.toJSONString(user);
    }
}
