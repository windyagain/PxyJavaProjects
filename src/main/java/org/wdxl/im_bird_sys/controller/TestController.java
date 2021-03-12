package org.wdxl.im_bird_sys.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wdxl.im_bird_sys.entity.ContentAndBtnText;
import org.wdxl.im_bird_sys.entity.VipType;


import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("/ask")
    @ResponseBody
    public String test() {
        return "test";
    }


    @RequestMapping("/parse")
    @ResponseBody
    public String testParseJson() {
        String jsonStr = "{'ret':0,'error_code':0,'error':'Ok','msg':'','data':{'my_page':{'not_vip':{'platform':[1,2,3],'text_config':{'zh-Hans':{'content':'\\u6211\\u662f\\u6587\\u6848\\u5185\\u5bb9','button_text':'\\u7acb\\u5373\\u9886\\u53d6'},'zh-Hant':{'content':'\\u6211\\u662f\\u6587\\u6848\\u5185\\u5bb9','button_text':'\\u7acb\\u5373\\u9886\\u53d6'},'en':{'content':'I am content text','button_text':'Get it now'}}},'expired_vip':{'platform':[1,2,3],'text_config':{'zh-Hans':{'content':'\\u6211\\u662f\\u6587\\u6848\\u5185\\u5bb9','button_text':'\\u7acb\\u5373\\u9886\\u53d6'},'zh-Hant':{'content':'\\u6211\\u662f\\u6587\\u6848\\u5185\\u5bb9','button_text':'\\u7acb\\u5373\\u9886\\u53d6'},'en':{'content':'I am content text','button_text':'Get it now'}}}},'half_popup':{'CN':{'not_vip':{'platform':[1,2,3],'text_config':{'zh-Hans':{'content':'\\u6211\\u662f\\u6587\\u6848\\u5185\\u5bb9','button_text':'\\u7acb\\u5373\\u9886\\u53d6'},'zh-Hant':{'content':'\\u6211\\u662f\\u6587\\u6848\\u5185\\u5bb9','button_text':'\\u7acb\\u5373\\u9886\\u53d6'},'en':{'content':'I am content text','button_text':'Get it now'}}},'expired_vip':{'platform':[1,2,3],'text_config':{'zh-Hans':{'content':'\\u6211\\u662f\\u6587\\u6848\\u5185\\u5bb9','button_text':'\\u7acb\\u5373\\u9886\\u53d6'},'zh-Hant':{'content':'\\u6211\\u662f\\u6587\\u6848\\u5185\\u5bb9','button_text':'\\u7acb\\u5373\\u9886\\u53d6'},'en':{'content':'I am content text','button_text':'Get it now'}}}\n" +
                "},'HK':{'not_vip':{'platform':[1,2,3],'text_config':{'zh-Hans':{'content':'\\u6211\\u662f\\u6587\\u6848\\u5185\\u5bb9','button_text':'\\u7acb\\u5373\\u9886\\u53d6'},'zh-Hant':{'content':'\\u6211\\u662f\\u6587\\u6848\\u5185\\u5bb9','button_text':'\\u7acb\\u5373\\u9886\\u53d6'},'en':{'content':'I am content text','button_text':'Get it now'}}},'expired_vip':{'platform':[1,2,3],'text_config':{'zh-Hans':{'content':'\\u6211\\u662f\\u6587\\u6848\\u5185\\u5bb9','button_text':'\\u7acb\\u5373\\u9886\\u53d6'},'zh-Hant':{'content':'\\u6211\\u662f\\u6587\\u6848\\u5185\\u5bb9','button_text':'\\u7acb\\u5373\\u9886\\u53d6'},'en':{'content':'I am content text','button_text':'Get it now'}}}\n" +
                "}}}}";
        JSONObject obj = JSON.parseObject(jsonStr);
        JSONObject data = obj.getJSONObject("data");
        String mypage = data.getString("my_page");
        System.out.println(mypage);
        VipType vipType = JSON.parseObject(mypage, VipType.class);
        System.out.println(vipType);
        System.out.println(vipType.getNotVip().getPlatform().toString());
        String language = "zh-Hant";
        System.out.println(vipType.getExpiredVip().getTextConfig().toString());
        Map<String, ContentAndBtnText> textConfigs = vipType.getExpiredVip().getTextConfig();
        ContentAndBtnText contentAndBtnText = textConfigs.get("zh-Hans");

        System.out.println("---> " + contentAndBtnText.toString());
        System.out.println("add test for dev branch");
        return "test";
    }
}
