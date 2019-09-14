package pojo;

import com.alibaba.fastjson.JSON;
import com.bdqn.pojo.User;
import com.bdqn.utils.JsonUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        User user1 = new User(1, "张三");
        User user2 = new User(2, "李四");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
//        将对象转换成JSON字符串
//        String jsonString = JSON.toJSONString(userList);
        String jsonString = JsonUtil.getJson(userList);
        System.out.println(jsonString);
        //        将JSON字符串转换成对象
        String jsonString1 = "{id:'1',name:'张三'}";
        String jsonString2 = "[{\"id\":1,\"name\":\"张三\"},{\"id\":2,\"name\":\"李四\"}]";
//        User user = JSON.parseObject(jsonString1, User.class);
        User user = JsonUtil.getObject(jsonString1, User.class);
        List<User> userList1 = JsonUtil.jsonToList(jsonString2, User.class);
        System.out.println(user);
        System.out.println(userList1);


    }


}