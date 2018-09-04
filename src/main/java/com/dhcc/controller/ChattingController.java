package com.dhcc.controller;

import com.dhcc.util.PublicMessage;
import com.dhcc.util.SendPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  ai_robot
 *  com.dhcc.controller
 *  @author:ShenTai
 *  @date: 2018/9/3  11:10
 */
@RequestMapping("/")
@Controller
public class ChattingController {

    @RequestMapping("/chatting")
    public String chatting(){
        return "chatting";
    }

    @RequestMapping("/chat")
    @ResponseBody
    public String chat(String cnt){
        String json = "{\"reqType\":0,\"perception\":{\"inputText\":{\"text\": \""+cnt+"\"}},\"userInfo\":{\"apiKey\":\""+ PublicMessage.APIKEY+"\",\"userId\": \"123\"}}";
        System.out.println("json = " + json);
        String result = new SendPost().sendPost(PublicMessage.AIURL,json);
        System.out.println("result = " + result);
        return result;
    }
}
