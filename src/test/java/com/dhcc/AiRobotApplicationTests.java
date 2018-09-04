package com.dhcc;

import com.dhcc.util.PublicMessage;
import com.dhcc.util.SendPost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AiRobotApplicationTests {

	@Test
	public void contextLoads() {
		String json = "{\"reqType\":0,\"perception\":{\"inputText\":{\"text\": \"我要报销\"}},\"userInfo\":{\"apiKey\":\""+PublicMessage.APIKEY+"\",\"userId\": \"123\"}}";
		System.out.println("json = " + json);
		String result = new SendPost().sendPost(PublicMessage.AIURL,json);
		System.out.println("result = " + result);
	}

}
