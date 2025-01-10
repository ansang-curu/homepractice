package kr.or.ysedu.c702;

import kr.or.ysedu.c702.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

    @GetMapping("/")
    public String hello(){
        return  "message";
    }

    @Autowired
    MessageService messageService;

    @GetMapping("/message/{title}")
    @ResponseBody
    public String message(@PathVariable("title")String myTitle)
    {
        messageService.createMessage((myTitle));
        return "저장 성공"+myTitle;
    }

}
